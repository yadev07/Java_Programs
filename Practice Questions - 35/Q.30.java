//Declare an array of integers and write a program that uses a for-each loop to calculate and print the sum of its elements.
class Q30 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,10} ;
		int sum = 0;
		for(int val : arr){
			sum+=val;
		}
		System.out.println("Sum of Array Elements is " + sum);
	}
}