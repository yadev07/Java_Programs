//Write a program that prints a simple star pattern (for example, a right-angled triangle) on the console.
import java.util.Scanner ; 

class Q25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = input.nextInt();
		
		for (int i=1  ; i<=range ; i++){
			for (int j=1 ; j<=i ; j++)
			System.out.print("* ");
			System.out.println();
		}
		input.close();
	}
}