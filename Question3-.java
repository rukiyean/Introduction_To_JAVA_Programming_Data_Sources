package Sorular;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//8.3 (Sort students on grades) 
	char[][] answers = {
			  {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			  {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			  {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			  {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			  {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			  {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			  {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			  {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
	char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

	int[] correctCounts = new int[answers.length];
	for (int i = 0; i < answers.length; i++) {
		   int correctCount = 0;
		   for (int j = 0; j < answers[i].length; j++) {
				 if (answers[i][j] == keys[j])
					 correctCount++;
			}
		   correctCounts[i] = correctCount;
	}

	sortStudents(answers, correctCounts);

	for (int i = 0; i < correctCounts.length; i++) {
        System.out.println("Student " + i + "'s correct count is " + correctCounts[i]);
    }
}
	public static void sortStudents( char[][] answers ,int[] correctCounts)
	{
		for (int i = 0; i < answers.length-1; i++) {
	            for (int j = 0; j < answers.length-i-1; j++) {
	            	 if (correctCounts[j] < correctCounts[j + 1]) {
	            		 int tempCount = correctCounts[j];
	                     correctCounts[j] = correctCounts[j + 1];
	                     correctCounts[j + 1] = tempCount;    
	                     
	                     char[] tempAnswers = answers[j];
	                     answers[j] = answers[j + 1];
	                     answers[j + 1] = tempAnswers;
	                }
	            }
	        }
      }

}
