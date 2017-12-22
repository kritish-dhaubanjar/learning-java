import java.util.Scanner;

public class Main{
	private static Scanner scan = new Scanner(System.in);

	public static void main(String [] args){
		int n;
		System.out.print("Enter no of elements for array:");
		n = scan.nextInt();
		
		int[] rawArray = getArray(n);
		int[] sortedArray = sortArray(rawArray);
		printArray(sortedArray);
		
	}
	
	public static int[] getArray(int n){
		int i;
		int[] array = new int[n];
		for(i=0; i<array.length; i++){
			System.out.print("Enter item " + i + ":");
			array[i] = scan.nextInt();
		}
		return array;
	}
	
	public static void printArray(int[] array){
		int i;
		for(i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static int[] sortArray(int[] array){
		int i,j,temp;
		for(i = 0; i<(array.length-1); i++){
			for(j=i+1; j<array.length; j++){
				if(array[i] < array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			} 
		}
		return array;
	}
}
