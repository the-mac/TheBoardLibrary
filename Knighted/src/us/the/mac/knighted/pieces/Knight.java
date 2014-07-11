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
		move_1 = fromCurPos(MOVE_UP_LEFT + MOVE_LEFT);// 6
		move_2 = fromCurPos(MOVE_UP_LEFT + MOVE_UP);// 15;
		move_3 = fromCurPos(MOVE_UP_RIGHT + MOVE_UP);// 17;
		move_4 = fromCurPos(MOVE_UP_RIGHT + MOVE_RIGHT);// 10;
		move_5 = fromCurPos(MOVE_DOWN_RIGHT + MOVE_RIGHT);// -6;
		move_6 = fromCurPos(MOVE_DOWN_RIGHT + MOVE_DOWN);// -15;
		move_7 = fromCurPos(MOVE_DOWN_LEFT + MOVE_DOWN);// -17;
		move_8 = fromCurPos(MOVE_DOWN_LEFT + MOVE_LEFT);// -10;
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
