package minesweeper;

import java.util.Arrays;
import java.util.Random;

public class Functions {

	/**
	 * Board's line number
	 */
	public static final int I = 5;

	/**
	 * Board's column number
	 */
	public static final int J = 5;

	/**
	 * Board that is shown to the player
	 */
	public static char[][] board = new char[I][J];

	/**
	 * Board where all the information about the bombs positions and how many bombs
	 * are around each tile
	 */
	public static int[][] boardNumbers = new int[I][J];

	/**
	 * Number of mines
	 */
	public static final int MINESNUMBER = 5;

	/**
	 * Number of positions that have been reveled
	 */
	public static int revealedPositions = 0;

	/**
	 * X position of the player
	 */
	public static int positionX = 0;

	/**
	 * Y position of the player
	 */
	public static int positionY = 0;

	/**
	 * Method to clear the path
	 * 
	 * @param line   Tile's line
	 * @param column Tiles's column
	 */
	public static void clearPath(int line, int column) {
		board[line][column] = 'O';
		int even = 0;
		// Loops to go through all the tiles surrounding the tile we chose
		for (int i = line - 1; i <= line + 1; i++) {
			for (int j = column - 1; j <= column + 1; j++) {
				even++;
				// If the condition meets, it means that the tile we are at right now is above,
				// to the left, to the right or below the tile we chose
				if (even % 2 == 0) {
					if (!(i - 1 < 0 || i + 1 > I) && !(j - 1 < 0 || j + 1 > J)) {
						// If there isn't any mines near the tile we change the board tile to O to show
						// that is clear and we call the function again so the player can keep playing
						if ((boardNumbers[i][j] == 0) && board[i][j] != 'O') {
							clearPath(i, j);
							revealedPositions++;
						}
						if (boardNumbers[i][j] > 0) {
							//Pasarlo a String y despues a caracter
							board[i][j] =  String.valueOf(boardNumbers[i][j]).charAt(0);
							
						}
					}
				}
			}
		}

	}

	public static void showBoard() {

		for (int i = 0; i < board.length; i++) {

			System.out.print("  " + i);

		}
		System.out.println();
		for (int i = 0; i < board.length; i++) {

			System.out.print((i) + " ");

			for (int j = 0; j < board[0].length; j++) {

				System.out.print(board[i][j] + "  ");

			}

			System.out.println();

		}
	}

	public static boolean checkWin() {
		boolean win = false;

		if ((I * J) - MINESNUMBER == revealedPositions) {
			win = true;
		}

		return win;

	}

	public static boolean checkLose(int y, int x) {
		boolean loose = false;
		if (boardNumbers[y][x] == -1) {
			loose = true;
		}
		return loose;

	}

	public static void createBoard() {

		for (int i = 0; i < board.length; i++) {
			Arrays.fill(board[i], 'X');
		}
	}

	public static void placeMines() {
		Random r = new Random();
		int mineI;
		int mineJ;

		for (int i = 0; i < board.length; i++) {

			do {
				mineI = r.nextInt(0, I);
				mineJ = r.nextInt(0, J);
			} while (boardNumbers[mineI][mineJ] == -1);

			boardNumbers[mineI][mineJ] = -1;
		}
	}

	public static void modifyBoard() {
		for (int i = 0; i < boardNumbers.length; i++) {
			for (int j = 0; j < boardNumbers[i].length; j++) {
				if (boardNumbers[i][j] == -1) {
					addOne(i, j);
				}
			}
		}
	}

	public static void addOne(int row, int column) {
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = column - 1; j <= column + 1; j++) {
				if (!(i < 0 || i >= J) && !(j < 0 || j >= J)) {
					if (boardNumbers[i][j] != -1) {
						boardNumbers[i][j]++;
					}
				}
			}
		}
	}
}
