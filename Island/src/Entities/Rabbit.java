package Entities;

public class Rabbit extends Herbivores {
    protected int mass = 3;
    public Rabbit() {

        super(AnimalType.RABBIT_TYPE);
       // setMass(3);
        setPriority(5);
        setMax_move(3);


    }


    @Override
    public void eat() {

    }
}
