package us.the.mac.knighted;

import us.the.mac.board.BoardDisplay;
import android.os.Bundle;
import android.view.Menu;

public class Knighted extends BoardDisplay {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.knighted);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.knighted, menu);
		return true;
	}

	@Override public void startGame() { }
	@Override public int getServerPlayerTime() { return -1; }
	@Override public us.the.mac.board.Board.Color getServerPlayerColor() { return null; }
	@Override public void startClientGameAs(us.the.mac.board.Board.Color c, int t) { }
}
