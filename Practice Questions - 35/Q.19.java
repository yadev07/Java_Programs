//Write a Java program that checks if a given string is a palindrome (reads the same backward as forward).
import java.util.Scanner;

class Q19 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter String: ");
		String str = input.nextLine() ;
	   int len = str.length();
		String val = "" ;
		
		for(int i=len-1 ; i>=0 ; i-- ){
			val += str.charAt(i);
		}
		
		if(val.equals(str))
		System.out.print("It's A Palindrome..!"); 
		else
		System.out.print("It's Not A Palindrome..!");
		input.close();
	}
}