package minesweeper;

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
	 * Number of positions that hace been reveled
	 */
	public static int revealedPositions = 0;

	/**
	 * Method to clear the path
	 * 
	 * @param line   Tile's line
	 * @param column Tiles's column
	 */
	public static void clearPath(int line, int column) {
		// Loops to go through all the tiles surrounding the tile we chose
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				// If the condition meets, it means that the tile we are at right now is above,
				// to the left, to the right or below the tile we chose
				if ((i + j) % 2 == 1) {
					if (!(i-1 < 0|| i+1 > I) && !(j-1 < 0|| j+1 > J))
					// If there isn't any mines near the tile we change the board tile to O to show
					// that is clear and we call the function again so the player can keep playing
					if (boardNumbers[i][j] == 0) {
						board[i][j] = 'O';
						revealedPositions++;
						clearPath(i, j);
					} else if (boardNumbers[i][j] > 0) {
						board[i][j] = (char) boardNumbers[i][j];
					}
				}
			}
		}

	}

}
