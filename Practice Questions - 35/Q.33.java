//Write a program that compares two strings for equality (use the equals() method) and prints whether they are equal or not.
import java.util.Scanner;

class Q33 {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter 1st String: ");
		String s1=val.nextLine();
		
		System.out.print("Enter 2nd String: ");
		String s2=val.nextLine();
		
		if (s1.equals(s2)){
			System.out.print("Both Strings Are Equal..!");
		}else{
			System.out.print("Both Strings Are Not Equal..!");
			val.close();
		}	
	}
}