package Entities;


public class Bear extends Predator {

    final int MAX_MASS = 500;
    final int MAX_COUNT_OF_EAT = 80;

    public int getMAX_MASS() {
        return MAX_MASS;
    }

    public int getMAX_COUNT_OF_EAT() {
        return MAX_COUNT_OF_EAT;
    }

    @Override
    public void eat() {
    }

    public Bear() {
        super(AnimalType.BEAR_TYPE);
        setMass(MAX_MASS);
        setMax_eat(MAX_COUNT_OF_EAT);

        //setMax_move(3);
        //setPriority(10);
    }
}


