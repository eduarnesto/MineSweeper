package minesweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable to store the x position of the player
		int x;

		// Variable to store the y position of the player
		int y;

		// Variable to know if the playes has lost
		boolean loose;

		// Variable to know if the playes has won
		boolean win = false;

		// Scanner to read from the keyboard
		Scanner sc = new Scanner(System.in);

		// Creation of the board
		Functions.createBoard();

		Functions.showBoard();
		
		//
		System.out.println("Enter the x position:");

		//
		x = sc.nextInt();

		System.out.println("Enter the y position:");

		//
		y = sc.nextInt();

		//
		Functions.placeMines();
		
		Functions.modifyBoard();
		
		Functions.clearPath(y, x);
		
		do {
			Functions.showBoard();
			
			System.out.println("Enter the x position:");

			//
			x = sc.nextInt();

			System.out.println("Enter the y position:");

			//
			y = sc.nextInt();
			
			loose = Functions.checkLose();
			
			if (!loose) {
				win = Functions.checkWin();
				Functions.clearPath(y, x);
			}
			
		} while(!win || loose);
		
		sc.close();
	}
}
