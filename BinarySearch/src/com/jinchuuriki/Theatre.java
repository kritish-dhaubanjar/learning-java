package com.jinchuuriki;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theatre {

    private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int rows, int columns) {
        this.name = name;
//        System.out.println((int)'A');
        for(char row = 'A'; row<'A' + rows; row++){
            for(int column=1; column<=columns; column++)
                //System.out.println(row + String.format("%02d",column));
                seats.add(new Seat(row + String.format("%02d",column)));
        }
    }

    public String getName(){
        return this.name;
    }

    public void listSeats(){
        for(Seat s:seats){
            System.out.println(s.getSeatNum());
        }
    }

    public boolean reserveSeat(String seatNum){
//        Seat reserve = null;
//        for(Seat s:seats){
//            if(s.getSeatNum().equals(seatNum)){
//                reserve = s;
//                break;
//            }
//        }

        Seat reserve = new Seat(seatNum);
        int foundPos = Collections.binarySearch(seats, reserve, null);

        //System.out.println(foundPos);


//        if(reserve != null){
//            if(!reserve.isReserve()) {
//                System.out.println("Please Pay");
//                reserve.reserve();
//            }
//            else
//                System.out.println("Already Reserved");
//        }

        if(foundPos >=0){
            if(seats.get(foundPos).isReserve() ==false){
                System.out.println("Please Pay");
                seats.get(foundPos).reserve();
            }else{
                System.out.println("Already Reserved");
            }
        }
        return true;


    }

    private class Seat implements Comparable<Seat>{
        String seatNum;
        boolean reserve;

        private Seat(String seatNum){
            this.seatNum = seatNum;
            this.reserve = false;
        }

        public boolean isReserve(){
            return reserve;
        }

        public String getSeatNum() {
            return seatNum;
        }

        public boolean reserve(){
            this.reserve = true;
            return true;
        }

        @Override
        public int compareTo(Seat o) {
            return this.getSeatNum().compareToIgnoreCase(o.getSeatNum());
        }
    }
}
