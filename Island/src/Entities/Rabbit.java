package Entities;

public class Rabbit extends Herbivores {
    final double MAX_MASS = 3;
    final double MAX_COUNT_OF_EAT = 0.45;

    public double getMAX_MASS() {
        return MAX_MASS;
    }

    public double getMAX_COUNT_OF_EAT() {
        return MAX_COUNT_OF_EAT;
    }


    public Rabbit() {

        super(AnimalType.RABBIT_TYPE);
        setMass(MAX_MASS);
        setMax_eat(MAX_COUNT_OF_EAT);

        // setPriority(5);
        //setMax_move(3);

    }

    @Override
    public void eat() {

    }
}
