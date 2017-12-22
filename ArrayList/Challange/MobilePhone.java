import java.util.ArrayList;

public class MobilePhone{

	private ArrayList<Contacts> contactList = new ArrayList<Contacts>();
	
	//add Contact
	public boolean createContact(String name, int number){
		boolean exists = (contactList.contains(new Contacts(name, number)));	
		if(!exists){
			Contacts newContact = new Contacts(name, number);
			contactList.add(newContact);
			return true;
		}
		return false;
	}
	
	//list Contact
	public void listContacts(){
		for(int i=0; i<contactList.size(); i++){
			System.out.println("Name :" + contactList.get(i).getName());
			System.out.println("Contact no:" + contactList.get(i).getNumber());
		}
	}
	
	//update Contact
	public boolean updateContact(String name, String newName, int newNumber){
		boolean exists = (contactList.contains(new Contacts(name)));
		if(exists){
		 	int id = (contactList.indexOf(new Contacts(name)));
			Contacts newContact = new Contacts(newName, newNumber);
			contactList.set(id, newContact);
			return true;
		}
		return false;
	}
	
	//remove Contact
	public boolean removeContact(String name){
		boolean exists = (contactList.contains(new Contacts(name)));
		if(exists){
		 	int id = (contactList.indexOf(new Contacts(name)));
			contactList.remove(id);
			return true;
		}
		return false;
	}
	
	//Search Contact
	public boolean searchContact(String name){
		boolean exists = (contactList.contains(new Contacts(name)));
		if(exists){
		 	int id = (contactList.indexOf(new Contacts(name)));
			Contacts foundContact = contactList.get(id);
			System.out.println(foundContact.getName() + " -> " + foundContact.getNumber());
			return true;
		}
		return false;
	}

}
