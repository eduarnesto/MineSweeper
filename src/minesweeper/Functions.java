package minesweeper;

public class Functions {
	public static final int M= 5;
	public static final int N= 5;
	public static char [][] board = {{'B','X','X','X','X'},{'X','X','X','X','X'},{'X','X','X','X','X'},{'X','X','X','X','X'},{'X','X','X','X','X'}};
	public static char [][] boardNumbers = new char[M][N];
	public static final int MINESNUMBER = 5;
	public int positionsRevealed = 0;
	public static int posicionX = 0;
	public static int posicionJ = 0;
	
	
	public static void modifyBoard() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if('B' == board[i][j]) {
					
				}
			}
		}
	}
	
	
}
