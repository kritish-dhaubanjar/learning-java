package com.jin.jyashaa;

import com.jinchuuriki.Series;

public class Main {

    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            System.out.print(Series.nSum(i));
            if(i != 10)
                System.out.print(",");
            else
                System.out.println();
        }
        for (int i=0; i<=10; i++) {
            System.out.print(Series.factorial(i));
            if(i != 10)
                System.out.print(",");
            else
                System.out.println();
        }
        for (int i=0; i<=10; i++) {
            System.out.print(Series.fibonacci(i));
            if(i != 10)
                System.out.print(",");
            else
                System.out.println();
        }
    }
}
