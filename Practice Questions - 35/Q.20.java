//Declare two string variables and write a program that concatenates them and prints the result.
import java.util.Scanner;

class Q20 {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 1st String: ");
		String str1 = input.nextLine();

		System.out.print("Enter 2nd String: ");
		String str2 = input.nextLine();

		System.out.println(str1 + str2);
		input.close();
	}
} 