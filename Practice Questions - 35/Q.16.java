//Create a program that finds and prints the maximum value stored in an integer array.
class Q16 {
	public static void main(String[] args) {
		int[] arr = {1,68,55,33,9,4,44};
		int v = arr[0];
		for(int i=1 ; i<7 ; i++){
			if(arr[i] > v){
				v = arr[i] ;
			}
		}
		System.out.println("Max Value : " + v);
	}
}