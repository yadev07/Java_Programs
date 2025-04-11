//Write a program that calculates and prints the average of the elements in an integer array.
class Q15 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = 7;
		int sum =0;
		for(int i=0 ; i<n ; i++){
			sum+= arr[i] ;
		}
		int avg = sum/n ;
		System.out.println("Result: " + avg);
	}
}