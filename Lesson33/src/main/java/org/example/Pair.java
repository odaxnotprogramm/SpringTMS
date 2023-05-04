package org.example;

public class Pair {
    private Horse horse;
    private Rider rider;
    private int totalSpeed;

    public Pair(Horse horse, Rider rider) {
        this.horse = horse;
        this.rider = rider;
        this.totalSpeed = horse.getSpeed() + rider.getSkill();
    }

    public Horse getHorse() {
        return horse;
    }

    public Rider getRider() {
        return rider;
    }

    public int getTotalSpeed() {
        return totalSpeed;
    }

    public void changePairSpeed(){
        int choice = (int) (Math.random() * 100);
        if(choice % 2 == 0) totalSpeed+=Math.random() * 100 % 30;
        else totalSpeed-=Math.random() * 100 % 30;
    }
}
