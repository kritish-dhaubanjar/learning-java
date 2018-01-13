package com.jinchuuriki;

public class Series {
    public static int nSum(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static long factorial(int n){
        long fact = 1l;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int fibonacci(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return (fibonacci(n-1) + fibonacci(n-2));
    }
}
