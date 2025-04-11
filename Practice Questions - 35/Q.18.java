//Write a program that reverses the digits of an integer (e.g., input: 1234, output: 4321).
import java.util.Scanner ;

class Q18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Value: ");
		int val = input.nextInt();
		int result = 0;
		while(val>0){
			result*=10;
			result += (val % 10);
			val/=10 ;
		}
		System.out.println("Result: " + result);
		input.close();
	}
}