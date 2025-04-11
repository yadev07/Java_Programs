//Write a Java program that counts and prints the number of vowels (a, e, i, o, u) in a given string.
import java.util.Scanner;

class Q22{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your String: ");
		String str = input.nextLine();
		int c=0;
		char[] vowels = {'A','E','O','I','U','a','e','o','i','u'};
		int len = str.length();
		for (int i=0 ; i<len ; i++){
			char ch = str.charAt(i);
			for(int j=0 ; j<10 ; j++){
				if(ch == vowels[j]){
					c++;
				}
			}
		}
		System.out.println(c + " Vowels..!");		
		input.close();
	}
} 