package Controller;

import Entities.Bear;
import Entities.Rabbit;

public class Controller {
    public static void main(String[] args) {

       /* Rabbit rabbit = new Rabbit();
        Bear bear = new Bear();

        bear.eat(rabbit);
       */
        int a = 10;
        int b = 14;
        int c = 0;
        int max = 15;

        if (a > b ) {
            c = a;
        }
        if (a < b) {
            c = b;

        }
        if (c > max) {
            c = max;
        }

        System.out.println(c);

    }

}
