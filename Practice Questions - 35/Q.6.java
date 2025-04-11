//Create a program that calculates the circumference of a circle given its radius. (Use the formula: circumference = 2 * π * radius. You can use Math.PI for π.)
import java.util.Scanner ;

class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int val = input.nextInt();
		
		double cir = 2 * Math.PI * val ;
		
		System.out.println("Result: " + cir );
		input.close();
	}
}