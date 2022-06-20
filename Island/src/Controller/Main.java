package Controller;

import Entities.AnimalType;
import Entities.Bear;
import Entities.Grass;
import Entities.Rabbit;

public class Main {
    public static void main(String[] args) {

        final EatDecider eatDecider = new EatDecider();

        Rabbit rabbit = new Rabbit();
        rabbit.setMass(4);
        Bear bear = new Bear();

        System.out.println(" Bear mass = " + bear.getMass());
        bear.setMass(248);

        if (eatDecider.willEat(bear.animalType, rabbit.animalType) && bear.getMass() < bear.getMAX_MASS()) {
            bear.eat(rabbit);
            int mass_pred = bear.getMAX_MASS() - bear.getMass();
            //проверка сколько медведь может сьесть
            if (mass_pred > rabbit.getMass()) { //-сильно голодный
                if (bear.getCount_eaten() >= rabbit.getMass()) {  // - сколько может сьесть
                    bear.setMass(bear.getMass() + rabbit.getMass());
                } else {
                    bear.setMass(bear.getMass() + bear.getCount_eaten());
                }

            } else {
                bear.setMass(bear.getMAX_MASS());
            }
        }
        System.out.println(" Bear mass = " + bear.getMass());
    }
}
