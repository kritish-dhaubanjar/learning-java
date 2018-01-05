public abstract class Team implements Comparable<Team>{
	private String name;
	private int rank;
	
	public Team(String name, int rank){
		this.name = name;
		this.rank = rank;
	}
	
	public int getRank(){
		return this.rank;
	}
	public String getName(){
		return this.name;
	}
	
	public int compareTo(Team team){
		if(this.rank > team.rank)
			return -1;
		else if(this.rank < team.rank)
			return 1;
		else 
			return 0;
	}
	
	
}
