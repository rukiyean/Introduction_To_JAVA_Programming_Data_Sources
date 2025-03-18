package Sorular;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//8.2 (Sum the major diagonal in a matrix)
        System.out.println("Enter a 4-by-4 matrix row by row:");
        
        double[][] list = new double[4][4];
        
        for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 4; j++)
        	{
        		list[i][j] = input.nextDouble();
        	}	
        }
        
        System.out.println("\nMatrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%6.2f ", list[i][j]);
            }
            System.out.println();
        }
        
        System.out.println(" ");
        System.out.println("Sum of the elements in the major diagonal is"+sumMajorDiagonal(list));

	}
		
		
	public static double sumMajorDiagonal(double[][] m)
	{
		int total = 0;
		 for (int i = 0; i < m.length; i++) {
			  for (int j = 0; j< m[i].length; j++)
			  {
				  total+=m[i][j];
			  }
	        }
		 return total;
	}

}
