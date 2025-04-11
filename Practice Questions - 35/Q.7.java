//Write a program that reads an integer and uses an if-else statement to determine if the number is positive, negative, or zero.
import java.util.Scanner ;

class Q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Value: ");
		int val = input.nextInt();
		
		if(val == 0)
			System.out.println("It's Zero..");
		else if(val>0)
			System.out.println("It's A Positive One.");
		else
		System.out.println("It's A Negative One.");
		input.close();
	}
}