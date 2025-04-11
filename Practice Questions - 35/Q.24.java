//Write a Java program that calculates and prints the sum of the digits of an integer.
import java.util.Scanner;

class Q24 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
					
		System.out.print("Enter Value: ");
		int val = input.nextInt();
		int sum=0 ;
		while(val >0 ){
			sum += (val % 10);
			val /=10;
		}
		System.out.println("Sum of the inputed digit is " + sum);
		input.close();
	}
}