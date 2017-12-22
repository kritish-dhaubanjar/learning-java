import java.util.Objects;

public class Contacts{
	private String name;
	private int number;
	
	public Contacts(String name){
		this.name = name;
		this.number = 0;
	}
	public Contacts(String name, int number){
		this.name = name;
		this.number = number;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return (getNumber() == contacts.getNumber() && Objects.equals(getName(), contacts.getName())) || 
        		Objects.equals(getName(), contacts.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

	
	public String getName(){
		return this.name;
	}
	
	public int getNumber(){
		return this.number;
	}
	
}
