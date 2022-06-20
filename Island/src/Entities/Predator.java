package Entities;

import Controller.Entity;

import java.util.SortedMap;

public abstract class Predator extends Animal {
    public Predator(AnimalType animalType) {
        super(animalType);
    }
    public void eat(Entity entity) {

        System.out.println(getClass().getSimpleName() + " eats " + entity.getClass().getSimpleName());
        entity.isAlive = false;
        System.out.println(entity.getClass().getSimpleName()+ " -  жертва!" );

    }


}
