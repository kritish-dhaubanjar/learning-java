public class Mobile implements ITelephone {
    private int number;

    public Mobile(int number) {
        this.number = number;
    }

    @Override
    public void call(int number) {
        System.out.println("Calling "+number+" from mobile..");
    }

    @Override
    public void powerOn() {
        System.out.println("Power On..");
    }

}
