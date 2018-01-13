package com.jinchuuriki;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter X:");
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
