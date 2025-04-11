//Write a Java program that converts a temperature in Celsius to Fahrenheit. (Formula: Fahrenheit = (Celsius * 9/5) + 32)
import java.util.Scanner ; 

class Q26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value in Celsius : ");
		double Celsius = input.nextDouble();	
		double Fahrenheit = (Celsius * 9/5) + 32 ;
		System.out.println("In Celsius: " + Celsius + "° C");
		System.out.println("In Fahrenheit: " + Fahrenheit + "° F");
		input.close();
	}
}