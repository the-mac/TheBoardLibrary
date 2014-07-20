Welcome to one of the most advanced board game systems built on top of the Android SDK. 
===============

With TheBoardLibrary students are making board games such as Chess, Xiangqi, Knighted and many more. The library runs on Android 2.2 (Level 8), or Froyo for all you snack lovers out there. So please make sure when building your own version of the library to have that SDK (2.2) installed in your Android SDK Manager.

The Piece(s) for your game are typically pretty easy to set up because of the required (abstract) methods such as setUpMoves(), firstColor(), and secondColor(); Where you can set specific move locations to be legal squares for that Piece, the first image/drawable for that Piece and the second image/drawable for that Piece respectively.

An example of how the Knight in ChessWars, Knighted and United Kingdoms moves is as follows:
```

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

```

The Java documentation for the setUpMoves can be found [here](http://the-mac.us/board/javadoc/us/the/mac/board/Board.Piece.html#setUpMoves()), or copy the following link: http://the-mac.us/board/javadoc/us/the/mac/board/Board.Piece.html#setUpMoves().


<h5>The Board Library is available under the Lesser General Public License (LGPL - https://www.gnu.org/licenses/lgpl.html), and includes Multi-Player, Tutoring/Guide facilities (to teach someone how to play your game), and board editor functions (to allow your users to learn more about the games they play).
<h5>

The Board Library project is extendable to any 64+ square board game of your choosing, and is planned to use Android features such as <a href="http://developer.android.com/guide/topics/connectivity/bluetooth.html">Bluetooth</a>,
			 <a href="http://developer.android.com/reference/java/net/Socket.html">Web Server</a>, <a href="http://developer.android.com/reference/android/widget/ImageView.html">Image Views</a>, 
			 <a href="http://developer.android.com/reference/android/widget/ImageView.html">Image Buttons</a> and <a href="http://developer.android.com/guide/topics/data/data-storage.html">File Importing/Exporting</a> 
			 (<a href="http://en.wikipedia.org/wiki/Portable_Game_Notation">pgn</a>).<br><br>
Although, if you are unsure whether you're ready for an Android project of this scale, take a look at the <b><a href="http://cse.spsu.edu/cslab/tutors/android.htm">Android Network Tutorial</a></b>
to get acquainted with Android in general, and if that was easy take a look at <b><a href="https://developer.android.com/training/basics/firstapp/index.html?hl=it">Building Your First App</a></b> from the <a href="https://developer.android.com">Android Site</a>.
