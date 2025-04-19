package Bolum10;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println(" enter an expression :");
		 String exp = input.nextLine();
		 
		 exp = exp.replaceAll("\\s+", "");
		 
		 char operator = ' ';
	     int operatorIndex = -1;
	     
	     for(int i=0 ;i< exp.length();i++)
	     {
	    	 char ch = exp.charAt(i);
	    	 if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	                operator = ch;
	                operatorIndex = i;
	                break;
	            }
	     }
	     if (operatorIndex == -1) {
	            System.out.println("No valid operator found.");
	            return;
	     }
	     
	     
	    String operand1Str = exp.substring(0, operatorIndex);
        String operand2Str = exp.substring(operatorIndex + 1);

        double operand1 = Double.parseDouble(operand1Str);
        double operand2 = Double.parseDouble(operand2Str);
		 
        double result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = operand1 / operand2;
                break;
        }

        System.out.println("Result: " + result);

	}

}
