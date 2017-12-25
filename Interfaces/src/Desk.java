public class Desk implements ITelephone {
    private int number;

    public Desk(int number){
        this.number = number;
    }

    @Override
    public void call(int number) {
        System.out.println("From Desk, Calling "+number);
    }

    @Override
    public void powerOn() {
        System.out.println("No Action!");
    }
}
