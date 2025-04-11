//Write a program that determines if a given year is a leap year. (Hint: A year is a leap year if it is divisible by 4 but not by 100, except if it is divisible by 400.)
import java.util.Scanner;

class Q35{
	public static void main(String[] args){
		Scanner val = new Scanner(System.in);
		System.out.print("Enter Year:  ");
		int year = val.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )){
			System.out.println("This is a Leap Year..!");
		}else{
			System.out.println("This is Not a Leap Year..!");
		}
		val.close();				
	}	
}