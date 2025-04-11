//Create a string array containing a few names. Write a program that uses a for-each loop to print each name.
import java.util.Scanner;

class Q31 {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		System.out.print("Enter Size of String Array:  ");
		int n = val.nextInt();
		val.nextLine();//Consumes the leftover newline 
	    String[] str= new String[n];
		
		System.out.println("Enter Strings---");
		for(int i=0 ; i<n ; i++){
			 System.out.print(i + ":");
			 str[i] = val.nextLine();
		}
		
			System.out.println();
			
			for(int i=0 ; i<n ; i++){
			 System.out.println(str[i]);
			
			 }		
			 val.close(); 	
	}
}