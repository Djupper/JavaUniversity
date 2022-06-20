package Entities;


import Controller.Entity;

public class Bear extends Predator {
    public int getMAX_MASS() {
        return MAX_MASS;
    }

    final int MAX_MASS = 250;
    @Override
    public void eat() {

    }
    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public void setMass(int mass) {
        this.mass = mass;
    }
    public Bear() {
        super(AnimalType.BEAR_TYPE);
        setMass(250);
        setCount_eaten(38);
        //setMax_move(3);
        //setPriority(10);



    }


}


