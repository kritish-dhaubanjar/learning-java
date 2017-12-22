public class PC{
	private String vendor;
	private Monitor theMonitor;

	public PC(String vendor, Monitor theMonitor){
		this.vendor = vendor;
		this.theMonitor = theMonitor;
	}

	public Monitor getMonitor(){
		return this.theMonitor;
	}
	public void switchOff(){
		theMonitor.turnOff();
	}
}