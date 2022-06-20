package Entities;

import Controller.Entity;

public class Grass extends Entity {
    protected int count;

    public Grass() {
        super(AnimalType.PLANT_TYPE);
    }

    public void growUp() {
        System.out.println("Трава ростет!");

    }
}
