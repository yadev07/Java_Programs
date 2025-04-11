//Write a program that reads a string and prints its length using the length() method.
import java.util.Scanner;

class Q32 {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter String:  ");
		String str = val.nextLine();
		
		int n = str.length();
		
		System.out.println("Length of String is " + n);
		val.close();
	}
}