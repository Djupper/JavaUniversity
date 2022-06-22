package Entities;

import Controller.Entity;

public class Grass extends Entity {
    private double count;

    public void setCount(double count) {
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "count=" + count +
                '}';
    }

    public Grass() {
        super(AnimalType.PLANT_TYPE);
        setCount(1);
    }


    public void growUp() {
        System.out.println("Трава ростет!");

    }
}
