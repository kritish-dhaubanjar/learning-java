public class Main{
	public static void main(String [] args){
		PC toshiba = new PC("Satellite", new Monitor("Dell", new Resolution(1024, 768)));
		toshiba.getMonitor().turnOn();
		toshiba.switchOff();
	}
}