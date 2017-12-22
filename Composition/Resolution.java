public class Resolution{
	private int height,width;

	public Resolution(int height, int width){
		this.height = height;
		this.width = width;
	}

	public String getResolution(){
		return (height + " X " + width);
	}

}