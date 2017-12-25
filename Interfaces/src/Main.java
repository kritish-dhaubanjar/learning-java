public class Main {
    public static void main(String[] args) {
        ITelephone jins = new Desk(01234567);
        jins.powerOn();
        jins = new Mobile(98436846);
        jins.call(15639746);
    }
}
