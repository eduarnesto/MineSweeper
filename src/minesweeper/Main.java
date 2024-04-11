package minesweeper;

public class Main {

	public static void main(String[] args) {
		int playerPos;
		boolean win = false;
		
		Functions.createBoard();

		Functions.placeMines();
		
		for(int[] numeron : Functions.boardNumbers) {
			for(int num : numeron) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}

}
