import java.util.ArrayList;

public class Main{
	public static void main(String [] args){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			myList.add(i);
			myList.add(new Integer(i*10));
		}
		for(int i=0; i<myList.size(); i++){
			System.out.println(myList.get(i));
		}
	}
}
