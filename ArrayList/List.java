import java.util.Scanner;

public class List{

	private static Scanner scan = new Scanner(System.in);
	
	private static Grocery newGrocery = new Grocery();
	
	public static void main(String [] args){
		int choice=0;
		boolean flag = false;
		
		while(!flag){
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice){
				case 1:
					add();
					break;
				case 2:
					remove();
					break;
				case 3:
					modify();
					break;
				case 4:
					print();
					break;
				case 5:
					copy();
					break;
				case 6:
					process();
					break;
			}
		}
	}
	public static void process(){
		newGrocery.processList();
	}
	public static void copy(){
		String[] array = new String[newGrocery.getGrocery().size()];
		array = newGrocery.getGrocery().toArray(array);
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + ",");
		}		
	}
	public static void add(){
		System.out.print("Enter Item:");
		String item = scan.nextLine();
		newGrocery.addItem(item);
	}
	public static void modify(){
		System.out.print("Enter Item:");
		String item = scan.nextLine();
		System.out.print("Enter new Item:");
		String newitem = scan.nextLine();
		newGrocery.modifyItem(item, newitem);
	}	
	public static void remove(){
		System.out.print("Enter Item:");
		String item = scan.nextLine();
		newGrocery.removeItem(item);
	}
	public static void print(){
		newGrocery.printList();
	}
}
