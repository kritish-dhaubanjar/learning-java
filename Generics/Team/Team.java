import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	private ArrayList<T> list;
	private int rank;
	
	public Team(String name, int rank){
		this.name = name;
		this.rank = rank;
		list = new ArrayList<>();
	}
	
	public void addPlayer(T player){
		list.add(player);
	}
	
	public void listPlayer(){
		for(T o:list){
			//System.out.println(((Player)o).getName());
			System.out.println(o.getName());
		}
	}
	@Override
	public int compareTo(Team<T> team){
		if(this.rank < team.rank)
			return -1;
		else if(this.rank > team.rank)
			return 1;
		else
			return 0;
	}
	
}
