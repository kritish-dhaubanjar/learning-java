public abstract class Bird {
    private String name;

    public Bird(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name +" is pecking.");
    }
    public void breathe(){
        System.out.println("Breathe in, Breathe out");
    }

    public abstract void fly();
}
