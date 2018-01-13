package com.jinchuuriki;

import java.util.Set;
import java.util.HashSet;

public final class HeavenlyBody {
    private final String name;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name) {
        this.name = name;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}
