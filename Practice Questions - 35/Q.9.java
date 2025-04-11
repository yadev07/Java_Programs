//Write a Java program to determine whether a given number is even or odd.
import java.util.Scanner ;

class Q9 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Value: ");
		int val = input.nextInt();
		if(val == 0)
			System.out.println("It's Zero.");
		else if(val%2==0)
			System.out.println("It's Even No.");
		else 
			System.out.println("It's Odd No.");
			input.close();
	}
}