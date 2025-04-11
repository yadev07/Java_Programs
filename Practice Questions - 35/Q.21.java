//Write a program that takes a string and prints the same string in uppercase letters.
import java.util.Scanner;

class Q21{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = input.nextLine();
		String result = str.toUpperCase();
		System.out.println("Result: " + result);
		input.close();
	}
}