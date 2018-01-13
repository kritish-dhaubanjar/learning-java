package com.jinchuuriki;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> languages= new HashMap<>();
        System.out.println(languages.put("Java", "Platform Independent"));
        languages.put("C", "God's Programming Language");
        languages.put("C++", "Object Oriented C");
        languages.put("PHP", "Personal Home Page Hypertext Preprocessor");
        System.out.println(languages.put("Java", "Platform Independent"));
//        languages.remove("Java","Platform Independent");
        languages.replace("Java","Platform Independent","Compiled Language");
        if(languages.containsKey("Java"))
            System.out.println("Java already Exists");
        else
            languages.put("Java", "Compiled Language");
        System.out.println(languages.keySet());

        for (String key: languages.keySet()){
            System.out.println(languages.get(key));
        }




    }
}
