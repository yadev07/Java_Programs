//Write a program that compares two integers and prints the larger one.
import java.util.Scanner ;

class Q8 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	   System.out.println("Enter 1st Value: ");
		int val1 = input.nextInt();
		
	   System.out.println("Enter 2nd Value: ");
		int val2 = input.nextInt();
		
		if(val1>val2)
			System.out.println("Larger One is " + val1);
		else
			System.out.println("Larger One is " + val2);
	
		input.close();
	}
}