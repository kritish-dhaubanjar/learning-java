public class Penguin extends Bird {

    public Penguin(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Can I go for a swim instead?");
    }
}
