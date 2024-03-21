package minesweeper;

import java.util.Random;

public class Functions {
	public static final int I = 5;
	public static final int J = 5;
	public static char[][] board = { { 'X', 'B', 'X', 'B', 'X' }, { 'X', 'X', 'B', 'X', 'X' },
			{ 'X', 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'B', 'X' }, { 'X', 'X', 'X', 'X', 'X' } };
	public static int[][] boardNumbers = { { 0, -1, 0, -1, 0 }, { 0, 0, -1, 0, 0 },
			{ 0, 0, 0, 0, 0 }, { 0, 0, 0, -1, 0 }, { 0, 0, 0, 0, 0 } };
	public static final int MINESNUMBER = 5;
	public int positionsRevealed = 0;
	public static int positionX = 0;
	public static int positionJ = 0;

	public static void modifyBoard() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(boardNumbers[i][j] != -1) {
					if(j > 0 && j < boardNumbers[i].length && boardNumbers[i][j - 1] == -1) {
						boardNumbers[i][j]++;
					}
					if(j >= 0 && j < boardNumbers[i].length - 1 && boardNumbers[i][j + 1] == -1) {
						boardNumbers[i][j]++;
					}
					if(i > 0 && i < boardNumbers.length && boardNumbers[i - 1][j] == -1) {
						boardNumbers[i][j]++;
					}
					if(i >= 0 && i < boardNumbers.length - 1 && boardNumbers[i + 1][j] == -1) {
						boardNumbers[i][j]++;
					}
					
				}
				
				
			}
		}
	}
	
}
