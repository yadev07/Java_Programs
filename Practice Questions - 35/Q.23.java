//Write a program that swaps the values of two numbers using a temporary variable and prints the swapped values.
import java.util.Scanner;

class Q23{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Value: ");	
		int val1 = input.nextInt();
		int temp;
		System.out.print("Enter 2nd Value: ");	
		int val2 = input.nextInt();
		
		System.out.println("Before Swapping--");
		System.out.println("Val1: " + val1);
		System.out.println("Val2: " + val2);

		temp = val1;
		val1 = val2;
		val2 = temp;

		System.out.println("After Swapping--");
		System.out.println("Val1: " + val1);
		System.out.println("Val2: " + val2);

		input.close();
	}
} 