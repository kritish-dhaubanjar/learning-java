class Car{
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;

	public Car(String name, int cylinders){
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
	}
	public String getName(){
		return this.name;
	}
	public int getCylinders(){
		return this.cylinders;
	}
	public void startEngine(){
		System.out.println(name + "'s Engine Started..");
	}
	public void accelerate(){
		System.out.println(name + "'s Engine accelerated..");
	}
	public void brake(){
		System.out.println(name + "'s Engine Braked..");
	}
}

class Fender extends Car{
	Fender(){
		super("Fender", 3);
	}
}
class Gibson extends Car{
	Gibson(){
		super("Gibson", 2);
	}
}
class PRs extends Car{
	PRs(){
		super("PRs", 1);
	}
}


public class Main{
	public static void main(String [] args){
		int i;
		for(i=0; i<=20; i++){
			Car garage = getRandomCar();
			garage.startEngine();
			garage.accelerate();
			garage.brake();
		}
	}
	public static Car getRandomCar(){
		int random = (int) (Math.random() * 3 + 1);

		System.out.println("random : " + random);

			switch(random){
				case 1:
					return new Fender();
				case 2:
					return new Gibson();
				case 3:
					return new PRs();
				default:
					return null;
			}
	}
}