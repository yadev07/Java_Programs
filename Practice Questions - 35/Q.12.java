//Write a Java program that prints the multiplication table (from 1 to 10) for a given number.
import java.util.Scanner ;

class Q12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int val = input.nextInt();
		
		for(int i=1 ; i<11 ; i++){
			System.out.println(val + " x " + i + " = " + val*i );
		}
		input.close();
	}
}