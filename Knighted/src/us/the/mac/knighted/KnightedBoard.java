package us.the.mac.knighted;

import us.the.mac.board.Board;
import us.the.mac.board.BoardContent;
import android.content.ContentValues;
import android.content.Context;
import android.util.AttributeSet;

public class KnightedBoard extends Board {
	
	public KnightedBoard(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	protected void currentSelection(Square squ) {
		super.currentSelection(squ);
	}
	
	protected void currentPieceMovement(Square squ) {
		
		boolean hasPiece = squ.piece != null;
		String currentlySelectedPiece = Piece.selectedPiece().toString();
		super.currentPieceMovement(squ);
		
		// UPDATING THE GAME WITH AN ID OF providern07_vs_shagism_2009_06_19 AND A MOVE
		String gameID = "providern07_vs_shagism_2009_06_19";
		String move = ""+(hasPiece ? currentlySelectedPiece + "x" + squ : currentlySelectedPiece + squ);
		
		moveToModelAPI(gameID, move);
	}

	private void moveToModelAPI(String gameID, String move) {
		
		// ASSIGNING THE BoardContent gameID
		String where = "gameID = ?";
		String[] selectionArgs = { gameID };
		
		// ASSIGNING THE BoardContent Move
		ContentValues values = new ContentValues();
		values.put(BoardContent.TableData.Move.TABLE_NAME, move);

		// UPDATING THE BoardContent WITH A MOVE FOR A SPECIFIC GAME
		getContext().getContentResolver().update(BoardContent.URI_UPDATE_MOVE, values, where, selectionArgs);
	}

	@Override
	public void onTimerEnded(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTimerUpdate(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

}
