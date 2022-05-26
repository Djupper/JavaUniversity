package Entities;

public abstract class Predator extends Animal {


    @Override
    public void eat(Object victim) {
        if (victim instanceof Animal){
            if(count_max_eat < mass){
                System.out.println();
            }

        }
        {

        }
    }
}
