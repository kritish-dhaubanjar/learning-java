import java.util.ArrayList;

public class Main{
	public static void main(String [] args){
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);

		for(Object x:list){
			System.out.println((Integer)x);
		}
	}
}

