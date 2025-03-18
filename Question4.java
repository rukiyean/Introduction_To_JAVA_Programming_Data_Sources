package Sorular;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	//8.4 (Compute the weekly hours for each employee) 
	double[][] list = new double[8][7];
        
	    for (int i = 0; i < 8; i++) {
	    	for (int j = 0; j < 7; j++)
	    	{
	    		list[i][j] = input.nextDouble();
	    	}	
	    }
	    
	    System.out.println("Calisan ve günler");
	    for (int i = 0; i < 8; i++) {
	        for (int j = 0; j < 7; j++) {
	            System.out.printf("%6.2f ", list[i][j]);
	        }
	        System.out.println();
	    }	
	    employee(list);

}
		
		
	public static void employee( double[][] list)
	{
		int total = 0;
		int[] ytotal = new int[list.length];
		 for (int i = 0; i < list.length; i++) {
			  for (int j = 0; j< list[i].length; j++)
			  {
				  total+=list[i][j];
			  }
			  ytotal[i]=total;
		}
		 for (int i = 0; i < list.length-1; i++) {
		    for (int j = 0; j < list.length-i-1; j++) {
			if (ytotal[i] < ytotal[j]) {
			    // Swap the numbers
			    int tempNum = ytotal[i];
			    ytotal[i] = ytotal[j];
			    ytotal[j] = tempNum;
		
			}
		    }
		}
		System.out.println("Sorted list of employee:");
		for (int i = 0; i < list.length; i++) {
		    System.out.println("employe: " + i + ", day: " + ytotal[i]);
		}	 
	}

}
