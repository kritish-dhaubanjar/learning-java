package com.jinchuuriki;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String name;
    private final int id;
    private final Map<String, Integer> exists;

    public Location(String name, int id) {
        this.name = name;
        this.id = id;
        this.exists = new HashMap<String, Integer>();
        this.exists.put("Q", 0);
    }

    public void addExit(String drxn, int id){
        this.exists.put(drxn, id);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, Integer> getExists() {
        return new HashMap<String, Integer>(exists);
    }
}
