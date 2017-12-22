import java.util.ArrayList;
public class Grocery{
	private ArrayList<String> groceryList= new ArrayList<String>();
	
	public ArrayList<String> getGrocery(){
		return this.groceryList;
	} 
	private int positionIndex(String item){
		boolean exists = groceryList.contains(item);
		if(exists)
			return groceryList.indexOf(item);
		else
			return -1;
	}	
	
	public void printList(){
		for(int i=0; i<groceryList.size(); i++){
			System.out.println((i+1) + ". " + groceryList.get(i));		
		}
	}
	
	public void addItem(String item){
		groceryList.add(item);
	}
	
	public void removeItem(String item){
		int pos = positionIndex(item);
		groceryList.remove(pos);
	}
	
	public void modifyItem(String item, String newItem){
		int pos = positionIndex(item);
		groceryList.set(pos, newItem);
		
	}
	
	public void processList(){
		ArrayList<String> grocery2List= new ArrayList<String>(groceryList);
		for(int i=0; i<grocery2List.size(); i++){
			System.out.println((i+1) + ". " + grocery2List.get(i));		
		}
	}
	
}







