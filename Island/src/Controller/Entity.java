package Controller;

import Entities.AnimalType;


public class Entity {
    public boolean isAlive = true;
    protected final AnimalType animalType;


    public Entity(AnimalType animalType) {
        this.animalType = animalType;
    }

}
