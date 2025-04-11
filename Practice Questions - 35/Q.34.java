//Write a Java program that prints the first n Fibonacci numbers (where n is a given positive integer).
import java.util.Scanner;

class Q34 {
	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner val = new Scanner(System.in);
		System.out.print("Enter Range:  ");
		int n = val.nextInt();
		
		System.out.println("Output---");
		System.out.print(a + " " + b + " ");
		for(int i=2 ; i<n ; i++){
			c = a + b;
			System.out.print(c + " ");
			a = b ;
			b = c ;
		}
		val.close();	
	}
}