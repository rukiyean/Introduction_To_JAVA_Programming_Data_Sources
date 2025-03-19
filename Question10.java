package Sorular;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//8.10	(Largest row and column)
	int[][] m = new int[4][4];

	for(int i=0 ;i<4 ;i++) {
		for(int j=0 ;j<4 ;j++) {
			m[i][j]=(int)(Math.random()*2);
		}
	}
	for(int i=0 ;i<4 ;i++) {
		for(int j=0 ;j<4 ;j++) {
			System.out.printf("%2d ",m[i][j]);
		}
		System.out.println();
	}
	
	int maxRowIndex = 0;
    int maxRowCount = 0;
    
	for(int i=0 ;i<4 ;i++) {
		int rowCount =0;
		for(int j=0 ;j<4 ;j++) {
			if(m[i][j]==1)
				rowCount++;	
		}
		if (rowCount > maxRowCount) {
            maxRowCount = rowCount;
            maxRowIndex = i;
        }
	}	
		
	 int maxColIndex = 0;
     int maxColCount = 0;

     for (int j = 0; j < 4; j++) {
         int colCount = 0;
         for (int i = 0; i < 4; i++) {
             if (m[i][j] == 1) {
                 colCount++;
             }
         }
         if (colCount > maxColCount) {
             maxColCount = colCount;
             maxColIndex = j;
         }
     }
		
     System.out.println("The largest row index: " + maxRowIndex);
     System.out.println("The largest column index: " + maxColIndex);
	}
}
