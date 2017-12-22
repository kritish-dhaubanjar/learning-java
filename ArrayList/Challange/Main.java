import java.util.Scanner;

public class Main{
	
	public static MobilePhone mobile = new MobilePhone();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String [] args){
		int choice;
		boolean loop = true;
		
		while(loop){
			System.out.print("Choice : ");
			choice = scan.nextInt();
			switch(choice){
				case 1:
					add();
					break;
				case 2:
					list();
					break;
				case 3:
					update();
					break;
				case 4:
					remove();
					break;
				case 5:
					search();
					break;
				case 6:
					loop = false;
					break;	
			}
		}
	}
	
	//Add
	
	public static void add(){
		System.out.println("main->add()");

		System.out.print("Name:");
		String name = scan.next();
		scan.nextLine();
		System.out.print("Number:");
		int number = scan.nextInt();
		scan.nextLine();
		
		boolean success = mobile.createContact(name,number);
		System.out.println(success);
	}
	
	//list
	
	public static void list(){
		mobile.listContacts();
	}

	//Update
	
	public static void update(){
		System.out.println("main->Update()");
		
		System.out.print("Search Name:");
		String name = scan.next();
		scan.nextLine();
		
		System.out.print("New Name:");
		String newName = scan.next();
		scan.nextLine();
		
		System.out.print("New Number:");
		int newNumber = scan.nextInt();
		scan.nextLine();
		
		boolean success = mobile.updateContact(name, newName,newNumber);
		System.out.println(success);
	}
	
	//Remove
	
	public static void remove(){
		System.out.println("main->Update()");
		
		System.out.print("Search Name:");
		String name = scan.next();
		scan.nextLine();

		
		boolean success = mobile.removeContact(name);
		System.out.println(success);
	}
	
	//Search
	public static void search(){
		System.out.println("main->Search()");
		
		System.out.print("Search Name:");
		String name = scan.next();
		scan.nextLine();

		boolean success = mobile.searchContact(name);
		System.out.println(success);
	}
	
}
