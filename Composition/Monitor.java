public class Monitor{
	private Resolution nativeResolution;
	private String vendor;

	public Monitor(String vendor, Resolution nativeResolution){
		this.vendor = vendor;
		this.nativeResolution = nativeResolution;
	}

	public void turnOn(){
		System.out.println("Turning On.." + nativeResolution.getResolution());
	}
	public void turnOff(){
		System.out.println("Turning Off.." + nativeResolution.getResolution());
	}
}