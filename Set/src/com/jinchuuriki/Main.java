package com.jinchuuriki;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury");
        HeavenlyBody tempMoon  = new HeavenlyBody("Mercury's Moon");
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);
        planets.add(temp);

        temp = new HeavenlyBody("Jupiter");
        tempMoon  = new HeavenlyBody("Jupiter's 1st Moon");
        temp.addMoon(tempMoon);
        tempMoon  = new HeavenlyBody("Jupiter's 2nd Moon");
        temp.addMoon(tempMoon);
        tempMoon  = new HeavenlyBody("Jupiter's 3rd Moon");
        temp.addMoon(tempMoon);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        for (HeavenlyBody planet: planets){
            System.out.println(planet.getName());
            for(HeavenlyBody moon: planet.getSatellites()){
                System.out.println(moon.getName());
            }
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: planets){
            moons.addAll(planet.getSatellites());
        }

        for(HeavenlyBody moon: moons){
            System.out.println(moon.getName());
        }


    }
}
