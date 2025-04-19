package Bolum10;

import java.util.Scanner;

public class StackOfIntegers2 {
	private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;
	public static void main(String[] args) {
		
		StackOfIntegers2 stack = new StackOfIntegers2();
		
		for(int i=2;i<119;i++)
		{
			if (isPrime(i)) {
	            stack.push(i);
	        }
		}
	    System.out.print("Prime numbers less than 120 in decreasing order: ");
	
		 while (!stack.empty())
			 System.out.print(stack.pop() + " ");
		
	}
	public static boolean isPrime(int num)
	{
		for(int i=2 ; i<=Math.sqrt(num) ; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public StackOfIntegers2() {
		 this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers2(int capacity) {
		 elements = new int[capacity];
	}
	
	
	public void push(int value) {
		 if (size >= elements.length) {
			 int[] temp = new int[elements.length * 2];
			 System.arraycopy(elements, 0, temp, 0, elements.length);
			 elements = temp;
		 }
		 elements[size++] = value;
	}
	
	public int pop() {
		 return elements[--size];
	 }
	
	public boolean empty() {
		 return size == 0;
	 }

}
