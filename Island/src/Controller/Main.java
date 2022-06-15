package Controller;

import Entities.Bear;
import Entities.Island;
import Entities.Rabbit;

import java.util.ArrayList;
import java.util.IdentityHashMap;

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear();

        System.out.println(bear);
        bear.setMass(2);
        bear.eat();
        System.out.println(bear);
        Rabbit rabbit = new Rabbit();
        System.out.println(rabbit);
        rabbit.setMass(1);
        rabbit.eat();
        System.out.println(rabbit);

        Island island =  new Island(10,2);



        }
    }
}
