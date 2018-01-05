public class Main{
	public static void main(String [] args){
		BasketballTeam teamA = new BasketballTeam("Team A", 9);
		BasketballTeam teamB = new BasketballTeam("Team B", 4);
		BasketballTeam teamC = new BasketballTeam("Team C", 7);
		BasketballTeam teamL = new BasketballTeam("Team L", 10);
		
		FootballTeam teamX = new FootballTeam("Team X", 4);
		FootballTeam teamY = new FootballTeam("Team Y", 5);
		FootballTeam teamZ = new FootballTeam("Team Z", 9);
		
		League<BasketballTeam> NBA = new League<BasketballTeam>("NBA");
		NBA.addTeam(teamA);
		NBA.addTeam(teamB);
		NBA.addTeam(teamC);
		NBA.addTeam(teamL);
		/*NBA.addTeam(teamX);
		NBA.addTeam(teamY);
		NBA.addTeam(teamZ);*/
		
		NBA.printTeam();
	}
}
