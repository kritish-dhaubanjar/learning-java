package com.jinchuuriki;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, String> navigations = new HashMap<String, String>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        navigations.put("NORTH", "N");
        navigations.put("EAST", "E");
        navigations.put("WEST", "W");
        navigations.put("SOUTH", "S");

        locations.put(1, new Location("Road", 1));
        locations.put(2, new Location("Hills", 2));
        locations.put(3, new Location("Building", 3));
        locations.put(4, new Location("Valley", 4));
        locations.put(5, new Location("Forest", 5));

        locations.get(1).addExit("N",5);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("W",2);
        locations.get(1).addExit("S",4);

        locations.get(2).addExit("N",5);

        locations.get(3).addExit("W",1);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);

        locations.get(5).addExit("W",2);
        locations.get(5).addExit("S",1);

        int current = 1;

        while (current !=0){
            System.out.println("Current Location: " + locations.get(current).getName());
            System.out.println(locations.get(current).getExists().keySet());

            System.out.println("Now, Where?");
            String nav = scanner.nextLine().toUpperCase();
            if (nav.length() == 1) {
                if (locations.get(current).getExists().containsKey(nav))
                    current = locations.get(current).getExists().get(nav);
            }
            String [] words = nav.split(" ");
            System.out.println(words.length);
            for (String word: words){
                if(navigations.containsKey(word)) {
                    current = locations.get(current).getExists().get(navigations.get(word));
                    break;
                }
            }




        }
    }

}
