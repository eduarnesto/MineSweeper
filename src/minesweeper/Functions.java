package minesweeper;

import java.util.Random;

public class Functions {
	public static final int I = 5;
	public static final int J = 5;
	public static char[][] board = { { 'X', 'B', 'X', 'B', 'X' }, { 'X', 'X', 'B', 'X', 'X' },
			{ 'X', 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'B', 'X' }, { 'X', 'X', 'X', 'X', 'X' } };
	public static int[][] boardNumbers = { { 0, -1, 0, -1, 0 }, { 0, 0, -1, 0, 0 }, { 0, 0, 0, 0, 0 },
			{ 0, 0, 0, -1, 0 }, { 0, 0, 0, 0, 0 } };
	public static final int MINESNUMBER = 5;
	public int positionsRevealed = 0;
	public static int positionX = 0;
	public static int positionJ = 0;

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
		for (int i = row-1; i <= row+1; i++) {
			for (int j = column-1; j <= column+1; j++) {
				if (!(i<0 || i>J) && !(j<0 || j>J) ) {
					if (boardNumbers[i][j] != -1) {
						boardNumbers[i][j]++;
					}
				}
			}
		}
	}
}
