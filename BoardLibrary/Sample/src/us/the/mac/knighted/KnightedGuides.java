package us.the.mac.knighted;

import us.the.mac.board.GuideBoardDisplay;
import android.os.Bundle;

public class KnightedGuides extends GuideBoardDisplay {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeGameGuide(R.layout.guide_knight_starting_positions);
	}

	@Override public void startGame() { }
	@Override public int getServerPlayerTime() { return -1; }
	@Override public us.the.mac.board.Board.Color getServerPlayerColor() { return null; }
	@Override public void startClientGameAs(us.the.mac.board.Board.Color c, int t) { }
}
