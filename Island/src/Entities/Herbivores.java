package Entities;

import Controller.Entity;

public abstract class Herbivores extends Animal{


    public Herbivores(AnimalType animalType) {
        super(animalType);
    }
    public void eat(Entity entity) {
        System.out.println(getClass().getSimpleName() + " " + entity.getClass().getSimpleName());
    }



}
