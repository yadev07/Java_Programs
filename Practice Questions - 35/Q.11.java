//Write a program that uses a while-loop to calculate and print the sum of numbers from 1 to 10.
class Q11 {
	public static void main(String[] args) {
		int sum =0 ;
		int i=1;
		while(i<11){
			sum+=i;
			i++;
		}
		System.out.println("Result: " + sum);
	}
}