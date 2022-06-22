package Controller;

import Entities.AnimalType;
import Entities.Bear;
import Entities.Grass;
import Entities.Rabbit;

public class Main {
    public static void main(String[] args) {

        final EatDecider eatDecider = new EatDecider();

        Rabbit rabbit = new Rabbit();

        Bear bear = new Bear();
        Grass grass = new Grass();

        System.out.println("Bear mass = " + bear.getMass());
        bear.setMass(200);
        rabbit.setMass(2);
        grass.setCount(1);
        System.out.println(grass);

        if (eatDecider.willEat(bear.animalType, rabbit.animalType)) {
            bear.eat(rabbit);
            double countOfEaten = bear.getMAX_MASS() - bear.getMass(); //������� ����� ������
            //�������� ������� ������� ����� ������
            if (countOfEaten > rabbit.getMass()) { //��������� ������� ������ ������ � ����� ������
                if (bear.getMAX_COUNT_OF_EAT() >= rabbit.getMass()) {  // ��������� ������������� ������ ����� � ���� ������ ( �� ������� ��)
                    bear.setMass(bear.getMass() + rabbit.getMass());
                } else {
                    bear.setMass(bear.getMass() + bear.getMAX_COUNT_OF_EAT());
                }
            } else {
                bear.setMass(bear.getMAX_MASS());
            }
        }

        if (eatDecider.willEat(rabbit.animalType, grass.animalType)) {
            rabbit.eat(grass);

            double countOfEaten = rabbit.getMAX_MASS() - rabbit.getMass();
            if (countOfEaten > grass.getCount()) { // ����������� ��� �������� �� �������
                if (rabbit.getMax_eat() < grass.getCount()) { // �������� ��� ����� �� ������ ��� �����
                    rabbit.setMass(rabbit.getMass() + grass.getCount());

                } else {
                    rabbit.setMass(rabbit.getMAX_MASS());
                }

            } else {
                rabbit.setMass(rabbit.getMass() + rabbit.getMax_eat());
            }
        }
        System.out.println(bear.toString() + bear.getMass());
        System.out.println(rabbit +(String.format("%2f", rabbit.getMass())));
    }
}
