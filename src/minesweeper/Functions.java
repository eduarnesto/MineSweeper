package minesweeper;

import java.util.Random;

public class Functions {
	public static final int I = 5;
	public static final int J = 5;
	public static char[][] board = new char[I][J];
	public static int[][] boardNumbers = new int[I][J];
	public static final int MINESNUMBER = 5;
	public int revealedPositions = 0;

	
	public static void createBoard() {
 
		for (int i = 0; i < board.length; i++) {
			System.out.print("  " + i);
		}
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			System.out.print((i) + " ");
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = 'x';
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
	}

	
	public static void placeMines() {
		Random r = new Random();
		int mineI;
		int mineJ;

		for (int i = 0; i < board.length; i++) {
			int cont = 0;

			do {
				mineI = r.nextInt(0, I);
				mineJ = r.nextInt(0, J);
			} while (boardNumbers[mineI][mineJ] == -1);

			boardNumbers[mineI][mineJ] = -1;

			System.out.println(mineI + " " + mineJ);
			System.out.println(boardNumbers[mineI][mineJ]);

		}
	}
}