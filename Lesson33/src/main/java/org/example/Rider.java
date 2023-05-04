package org.example;

public class Rider {
    private String name;
    private int skill;

    public Rider(String name) {
        this.name = name;
        this.skill = (int) (Math.random() * 100 % 80);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
