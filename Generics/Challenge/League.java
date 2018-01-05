import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
//public class League<T>{
//public class League<T extends Team>{

public class League <T extends Team> {
	private String name;
	//private List<Team> list;
	private ArrayList<T> list;
	
	public League(String name){
		this.name = name;
		//this.list = new ArrayList<Team>();
		this.list = new ArrayList<T>();
	}	
	
	/*public void addTeam(Team team){
		list.add(team);
	}
	
	public void printTeam(){
		for(Team o:list){
			System.out.println(o.getName());
		}
	}*/
	
	public void addTeam(T team){
		list.add(team);
	}
	
	public void printTeam(){
		Collections.sort(list);
		for(T o:list){
			//System.out.println(((Team)o).getName());
			System.out.println(o.getName());
		}
	}

}

























