package com.jinchuuriki;
import com.jin.game.Monster;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Monster dragon = new Monster();
        System.out.println("Dragon's Health = " + dragon.getHealth());
        System.out.println("Dragon's Hit points = " + dragon.getHitpoints());
    }
}
