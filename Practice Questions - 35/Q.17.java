//Write a Java program that calculates the factorial of a given positive integer using a loop.
import java.util.Scanner ; 

class Q17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int val = input.nextInt();
		int sum =1 ;
		for(int i = val ; i>0 ; i--){
			sum *= i ;
		}
		System.out.println("Result: " + sum);
		input.close();
	}
}