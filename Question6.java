package Sorular;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//8.6 (Algebra: multiply two matrices) 
    
	double[][] a = new double[3][3];
	double[][] b = new double[3][3];
	
	System.out.println("Enter matrix 1:");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		    a[i][j] = input.nextDouble();
		}
	}
	System.out.println("Enter matrix 2:");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j <3; j++) {
		    b[i][j] = input.nextDouble();
		}
	}
	
	
	
	System.out.println("\nMatrix 1:");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j <3; j++) {
		    System.out.printf("%6.1f ", a[i][j]);
		}
		System.out.println();
	}
	
	System.out.println("\nMatrix 2:");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j <3; j++) {
		    System.out.printf("%6.1f ", b[i][j]);
		}
		System.out.println();
	}
	    	
	    double[][] result = multiplyMatrix(a, b);
	    System.out.println("\nThe matrices are added as follows:");
	    printMatrix(result);
	}
		
		
	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		
	    double[][] c = new double[3][3];
	     
	     for(int i=0; i<3; i++)
	     {
	    	 for(int j=0; j<3; j++)
	    	 {
	    		 c[i][j] = 0;
	                for (int k = 0; k < 3; k++) { // Ortak eleman sayacı
	                    c[i][j] += a[i][k] * b[k][j];
	                }
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
