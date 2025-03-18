package Sorular;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
	   //8.5 (Algebra: add two matrices)
	   System.out.println("nxn Enter matrix1 lenght:");
	    int a0 = input.nextInt();
	    int a1 = input.nextInt();
	    System.out.println("nxn Enter matrix2 lenght:");
	    int b0 = input.nextInt();
	    int b1 = input.nextInt();
	   
	    if(a0!=b0 || a1!=b1)
	    {
	    	 System.out.println("Incorrect entry! Matrix dimensions must match.");
	         return;
	    }
	    
	    double[][] a = new double[a0][a1];
	    double[][] b = new double[b0][b1];
	    
	    System.out.println("Enter matrix 1:");
	    for (int i = 0; i < a0; i++) {
	        for (int j = 0; j < a1; j++) {
	            a[i][j] = input.nextDouble();
	        }
	    }
	    System.out.println("Enter matrix 2:");
	    for (int i = 0; i < b0; i++) {
	        for (int j = 0; j < b1; j++) {
	            b[i][j] = input.nextDouble();
	        }
	    }
	    
	 
	   
	    System.out.println("\nMatrix 1:");
	    for (int i = 0; i < a0; i++) {
	    	for (int j = 0; j <a1; j++) {
	            System.out.printf("%6.1f ", a[i][j]);
	        }
	        System.out.println();
	    }
	    
	    System.out.println("\nMatrix 2:");
	    for (int i = 0; i < b0; i++) {
	    	for (int j = 0; j <b1; j++) {
	            System.out.printf("%6.1f ", b[i][j]);
	        }
	        System.out.println();
	    }
	    	
	    double[][] result = addMatrix(a, b);
	    System.out.println("\nThe matrices are added as follows:");
	    printMatrix(result);
			}
			public static double[][] addMatrix(double[][] a, double[][] b)
		{
			int rows = a.length;
		    int cols = a[0].length;
		    double[][] c = new double[rows][cols];
		     
		     for(int i=0; i<rows; i++)
		     {
		    	 for(int j=0; j<cols; j++)
		    	 {
		    		 c[i][j] = a[i][j] + b[i][j];
		    	 }
		    	
		     } 
		     return c;
		}
		public static void printMatrix(double[][] matrix) {
	        for (double[] row : matrix) {
	            for (double val : row) {
	                System.out.printf("%6.1f ", val);
	            }
	            System.out.println();
	        }
	    }

}
