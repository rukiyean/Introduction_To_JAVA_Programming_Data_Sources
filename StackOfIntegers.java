package Bolum10;

import java.util.Scanner;

public class StackOfIntegers {
	private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number : ");
		int num = input.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers(num);
		
		for(int i=2;i<num;i++)
		{
			while (num % i == 0) {
	           stack.push(i);
	            num /= i;
	        }
		}
        System.out.print("Prime factors in decreasing order: ");

		 while (!stack.empty())
			 System.out.print(stack.pop() + " ");
		
	}
	public StackOfIntegers() {
		 this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
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
