package com.jinchuuriki;

public class Main {

    public static void main(String[] args) {
        Theatre jin = new Theatre("Jin's Threater", 5,5);
        //jin.listSeats();
        jin.reserveSeat("A01");
        jin.reserveSeat("E05");
        jin.reserveSeat("E05");
        jin.reserveSeat("D05");
        jin.reserveSeat("E05");
    }
}
