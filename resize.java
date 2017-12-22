
public class resize{
	public static void main(String [] args){
		int[] raw = {10,20,30,40,50};
		for(int i=0; i<raw.length; i++){
			System.out.println(raw[i]);
		}
		
		int[] resize = raw;
		raw = new int[10];
		
		for(int i=0; i<resize.length; i++){
			raw[i] = resize[i];
		}
		
		raw[5] =6;
		raw[6] =66;
		raw[7] =666;
		for(int i=0; i<raw.length; i++){
			System.out.println(raw[i]);
		}
	}
}
