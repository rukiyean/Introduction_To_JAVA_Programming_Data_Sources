package Sorular;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	     System.out.println("Enter a 3-by-4 matrix row by row:");
	        
	        double[][] list = new double[3][4];
	        
	        for (int i = 0; i < 3; i++) {
	        	for (int j = 0; j < 4; j++)
	        	{
	        		list[i][j] = input.nextDouble();
	        	}	
	        }
	        
	        System.out.println("\nMatrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.printf("%6.2f ", list[i][j]);
	            }
	            System.out.println();
	        }
	        
	        System.out.println(" ");
	        for (int j = 0; j < 4; j++) {
	            double sum = sumColumn(list, j);
	        	System.out.println("Sum of the elements at column " + j + " is "+ sum);

	        }

		}
		public static double sumColumn(double [][] list, int columnIndex)
		{
			int total = 0;
			 for (int i = 0; i < list.length; i++) {
		        		total += list[i][columnIndex];
		        }
			 return total;
		}

}
