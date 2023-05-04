package org.example;

public class Horse {
    private String name;
    private int speed;

    public Horse(String name) {
        this.name = name;
        this.speed = (int) (Math.random() * 100 % 60);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
