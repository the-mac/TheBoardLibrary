Welcome to one of the most advanced board game platforms built on top of the Android SDK. 
===============
<h5>With TheBoardLibrary students are making board games such as ChessWars, Xiangqi, United Kingdoms and many more. The library includes Multi-Player (currently over Bluetooth), Tutoring/Guide facilities (to teach someone how to play your game), and board editor functions (to allow your users to learn more about the games they play).
<h5>
![ChessWars](https://lh5.ggpht.com/jXByrzsaDxRo23cinCcnGJv7jDBrJiaeSlJWGl5jYrKnBDFDEkQ7KnLffQW5OfO8D2A=h900)

What you should know before getting started...
===============
The Board Library project is extendable to any 64+ square board game of your choosing, and is currently using (or planned to use) Android features such as <a href="http://developer.android.com/guide/topics/connectivity/bluetooth.html">Bluetooth</a>,
			 <a href="http://developer.android.com/reference/java/net/Socket.html">Web Server</a>, <a href="http://developer.android.com/reference/android/widget/ImageView.html">Image Views</a>, 
			 <a href="http://developer.android.com/reference/android/widget/ImageView.html">Image Buttons</a> and <a href="http://developer.android.com/guide/topics/data/data-storage.html">File Importing/Exporting</a> 
			 (<a href="http://en.wikipedia.org/wiki/Portable_Game_Notation">pgn</a>).<br><br>
			 
TheBoardLibrary is fun to be a part of as an experienced developer and a great starter application for those that are blooming Android Developers. If you are unsure whether you're ready for an Android project of this scale, take a look at the <b><a href="http://cse.spsu.edu/cslab/tutors/android.htm">Android Network Tutorial</a></b> to get acquainted with Android in general, and if that was easy take a look at <b><a href="https://developer.android.com/training/basics/firstapp/index.html?hl=it">Building Your First App</a></b> from the <a href="https://developer.android.com">Android Developer Site</a>. After litmus testing your strength in Android, you should be able to start running the Knighted Sample Project linked below (in the Getting Started section).

Also, the library runs on Android 2.2 (Level 8), or Froyo for all you snack lovers out there. So please make sure when building your own version of the library to have that SDK (2.2) installed in your Android SDK Manager.

If you have any further questions or want to see more sample code, please refer to our [FAQ](https://github.com/the-mac/TheBoardLibrary/wiki/Frequently-Asked-Questions) page.


Setting Up Your Piece(s)
===============
The Piece(s) for your game are typically pretty easy to set up because of the required (abstract) methods such as setUpMoves(), firstColor(), and secondColor(); Where you can set specific move locations to be legal squares for that Piece, the first image/drawable for that Piece and the second image/drawable for that Piece respectively.

An example of how the Knight in ChessWars, Knighted and United Kingdoms moves is as follows:

```

/** 
 * This is called each time a piece moves, and should use the MOVE constants 
 * (MOVE_UP, etc.). When assigning the move values from 1 - 8, you can use a 
 * clockwise motion (move_1 - top left, move_2 - top, etc.). These moves are 
 * used set up the direction of movement and final position of a move.
 * For example with the Knight in Knighted or Chess:
 * 
 * move_1 = fromCurPos(MOVE_UP_LEFT + MOVE_LEFT); // 6
 * move_2 = fromCurPos(MOVE_UP_LEFT + MOVE_UP); // 15
 * ...etc.
 * 
 *   14| 15| 16| 17| 18
 *   ------------------
 *   6 | 7 | 8 | 9 | 10
 *   ------------------
 *  -2 |-1 |pos| 1 | 2
 *   ------------------
 * -10 |-9 |-8 |-7 | 10
 *   ------------------
 * -18 |-17|-16|-15|-14
 * 
 */
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

The Java documentation for the setUpMoves method can be found [here](http://the-mac.us/board/javadoc/us/the/mac/board/Board.Piece.html#setUpMoves()), or click/copy the following link: http://the-mac.us/board/javadoc/us/the/mac/board/Board.Piece.html#setUpMoves().

The remaining Piece(s) may have different logic than this depending upon your game, but the concept should still be the same. In some cases the move_# variables may not be enough (for example with a Bishop from Chess), so an ArrayList and the Square.setPossible(boolean possible) method may be a friend when extending moves across the board.


Licensing
===============
The Board Library is available under the Lesser General Public License and more can be found on the LGPL here - https://www.gnu.org/licenses/lgpl.html. With the LGPL, using TheBoardLibrary for a derived application is legal to provide publicly at no cost or for sale.

	 
Getting Started
===============
The starter project is a fork of the original Board Library, with a Knighted project inside containing a sample Knight java file (with a setUpMoves, etc.) and a knighted xml file (containing two Knights). That particular repo/sample can be found [here](https://github.com/cdm2012/TheBoardLibrary) (https://github.com/cdm2012/TheBoardLibrary). 

To get your own version/fork of the board library simply clicking the link/button titled fork above will do the job. Although if you want to start with a sample project click on the link/button titled fork on the [Knighted version of TheBoardLibrary](https://github.com/cdm2012/TheBoardLibrary) (https://github.com/cdm2012/TheBoardLibrary), which will provide you with your own version of TheBoardLibrary with a working sample project (to rename to your own idea/game). 

If you want to keep your version/project private, simply clone (from your fork) and start your board game in your own private repo (outside of GitHub -> locally on your computer or possibly on Bitbucket?), but in both cases keep in mind that there will be bug fixes and library enhancements that will be coming from the remote repo: https://github.com/the-mac/TheBoardLibrary.git. So keep an open eye for pull requests and pull as often as possible.


Once again if you have any further questions or want to see more sample code, please refer to our [FAQ](https://github.com/the-mac/TheBoardLibrary/wiki/Frequently-Asked-Questions) page, Good Luck!

# CONTRIBUTORS

The Board Library contains contributions from engineers, computer scientists, and mobile programmers
from around the world. They include (but are not limited to):

* Michael Adeyosoye
* Christopher Miller
* Nathan Louis
* Greg Newman
* Itsoya Abebe
