package minesweeper;

public class Functions {
	public static final int N = 5;
	public static final int M = 5;
	public static char[][] board = new char[N][M];
	public static char[][] boardNumbers = new char[N][M];
	public static final int MINESNUMBER = 5;
	public static int positionsRevealed = 0;
	public static int posicionX = 0;
	public static int posicionY = 0;

	public static void showBoard() {

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

	public static boolean checkWin() {
		boolean win = false;

		if ((N * M) - MINESNUMBER == positionsRevealed) {
			win = true;
		}

		return win;

	}

	public static boolean checkLose() {
		boolean loose = false;
		if (boardNumbers[posicionX][posicionY] == -1) {
			loose = true;
		}
		return loose;

	}
}
