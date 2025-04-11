//Write a program that converts a distance in miles to kilometers. (Use the conversion: 1 mile ≈ 1.60934 km)
import java.util.Scanner ; 

class Q27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter Value in miles : ");
		int miles = input.nextInt();
		double km = miles * 1.60934 ;
		
		System.out.println("In Miles : " + miles + " miles ");
		System.out.println("In Km : " + km + " Km ");
		input.close();
	}
}