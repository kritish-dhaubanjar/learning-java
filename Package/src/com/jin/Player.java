package com.jin;

public class Player {
    private int hitpoints;
    private int health;

    public Player(int hitpoints, int health) {
        this.hitpoints = hitpoints;
        this.health = health;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
