//Write a Java program that calculates and prints the area of a rectangle given its length and width.
import java.util.Scanner ;

class Q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int l = input.nextInt();
		input.nextLine();

		System.out.println("Enter Breadth: ");
		int b = input.nextInt();
		input.nextLine();
		
		int result = l * b ;
		
		System.out.println("Result: " + result);
		input.close();	
	}
}