import java.util.Scanner;

public class Main{
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String [] args){
		int i,n;
		System.out.print("Enter the no. of Elements:");
	 	n = scan.nextInt();
	 	
		int[] intArray = getArray(n);
		
		for(i=0; i<intArray.length; i++){
			System.out.println(intArray[i]);
		}
		
		System.out.println("Average: " + getAverage(intArray));
	}
	
	public static int[] getArray(int length){
		int i;
		int[] intArray = new int[length];
		for(i=0; i<intArray.length; i++){
			System.out.print("Enter " + i + "element: ");
			intArray[i] = scan.nextInt();
		}
		return intArray;
	}	
	
	public static double getAverage(int[] array){
		int i,sum = 0;
		for(i=0; i<array.length; i++){
			sum += array[i];
		}
		return (double)sum / (double)array.length;
	}
}
