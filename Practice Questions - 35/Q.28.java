//Write a program that uses a switch-case statement to print the day of the week for an integer input (e.g., 1 for Monday, 2 for Tuesday, etc.).
import java.util.Scanner ; 

class Q28 {
	public static void main(String[] args) {
		Scanner week =new Scanner(System.in) ; 
		System.out.print("Enter a No. btwn (1-7): "); 
		int val = week.nextInt();
		
		switch(val){
			case 1 :
				 System.out.println("Monday..!");
				 break ; 
			case 2 : 
				System.out.println("Tueday..!");
				break ; 
			case 3 : 
				System.out.println("Wednesday..!");
				break;
			case 4 : 
				System.out.println("Thursday..!");
				break ;
			case 5 : 
				System.out.println("Friday..!");
				break ;
			case 6 : 
				System.out.println("Saturday..!");
				break ; 
			case 7 : 
				System.out.println("Sunday..!");
				break ;
			default :
				System.out.println("Enter a Valid Input..!");
				break ;
		
		}
		week.close();
	}
}