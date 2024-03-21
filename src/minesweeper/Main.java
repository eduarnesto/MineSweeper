package minesweeper;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		for(char fila[] : Functions.board) {
			for(char valor : fila) {
				System.out.print(valor + "");
			}
			System.out.println();
		}
		Functions.modifyBoard();
		System.out.println();
		for(int fila[] : Functions.boardNumbers) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

	}

}
