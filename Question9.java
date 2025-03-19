package Sorular;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[][] board = new int[3][3];
    boolean xTurn = true;
    int moves = 0;
    while(moves<9)
    {
	printBoard(board);
	int row,col;
	while(true)
	{
		System.out.println("Enter a row (0, 1, or 2) for player " + (xTurn ? "X" : "O") + ": ");
	    row = input.nextInt();
	    System.out.println("Enter a column (0, 1, or 2) for player " + (xTurn ? "X" : "O") + ": ");
	    col = input.nextInt();
	    
	    if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == 0) {
		board[row][col] = xTurn ? 1 : 2; // Set 'X' (1) or 'O' (2)
		moves++;
		break;
	    } else {
		System.out.println("Invalid move! Try again.");
	    }
	}
	 if (checkWinner(board, xTurn ? 1 : 2)) {
	     printBoard(board);
	     System.out.println("Player " + (xTurn ? "X" : "O") + " wins!");
	     return;
	 }
	 xTurn = !xTurn;
    	
    }
		
    printBoard(board);
    System.out.println("It's a draw!");
		}
	public static void printBoard(int[][] table) {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == 1) {
                    System.out.print(" X ");
                } else if (table[i][j] == 2) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    // Check if a player has won
    public static boolean checkWinner(int[][] table, int player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == player && table[i][1] == player && table[i][2] == player) ||  // Row
                (table[0][i] == player && table[1][i] == player && table[2][i] == player)) {  // Column
                return true;
            }
        }

        // Check diagonals
        if ((table[0][0] == player && table[1][1] == player && table[2][2] == player) ||  // Main diagonal
            (table[0][2] == player && table[1][1] == player && table[2][0] == player)) {  // Opposite diagonal
            return true;
        }

        return false;
    }	
}
