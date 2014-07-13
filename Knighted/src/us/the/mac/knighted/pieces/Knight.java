package us.the.mac.knighted.pieces;

import us.the.mac.board.Board.Piece;
import us.the.mac.knighted.R;

import android.content.Context;
import android.util.AttributeSet;

public class Knight extends Piece {

	public Knight(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void setUpMoves() {
		
		move_1 = validateMove(MOVE_UP_LEFT + MOVE_LEFT);// 6
		move_2 = validateMove(MOVE_UP_LEFT + MOVE_UP);// 15;
		move_3 = validateMove(MOVE_UP_RIGHT + MOVE_UP);// 17;
		move_4 = validateMove(MOVE_UP_RIGHT + MOVE_RIGHT);// 10;
		move_5 = validateMove(MOVE_DOWN_RIGHT + MOVE_RIGHT);// -6;
		move_6 = validateMove(MOVE_DOWN_RIGHT + MOVE_DOWN);// -15;
		move_7 = validateMove(MOVE_DOWN_LEFT + MOVE_DOWN);// -17;
		move_8 = validateMove(MOVE_DOWN_LEFT + MOVE_LEFT);// -10;
	}
	
	private int validateMove(int move) {
		
		int possibleMove = fromCurPos(move);
		Piece p = getPieceAt(possibleMove);
		
		boolean hasPiece = p != null;
		boolean isOpponent = hasPiece && p.isOpponent(color);
		
		if(isOpponent || !hasPiece) 
			return possibleMove;
		
		return INVALID_MOVE;
	}

	@Override
	protected int firstColor() {
		return R.drawable.n__;
	}

	@Override
	protected int secondColor() {
		return R.drawable.n_;
	}
	
	protected String pieceLetter() {
		return "N";
	}
}
