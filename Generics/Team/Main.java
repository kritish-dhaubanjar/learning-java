public class Main{
	public static void main(String [] args){
		BaseballPlayer joy = new BaseballPlayer("Joy");
		SoccerPlayer roy = new SoccerPlayer("Roy");
		Team<BaseballPlayer> A = new Team<>("A Team", 10);
		Team<BaseballPlayer> B = new Team<>("B Team", 9);
		Team<BaseballPlayer> C = new Team<>("C Team", 5);
		Team<SoccerPlayer> soccer = new Team<>("Soccer Team", 100);
		A.addPlayer(joy);
		B.addPlayer(joy);
		C.addPlayer(joy);
		System.out.println(A.compareTo(B));
		System.out.println(C.compareTo(B));
		System.out.println(C.compareTo(C));
		//System.out.println(A.compareTo(soccer));
		//baseball.addPlayer(roy);
		A.listPlayer();
	}
}
