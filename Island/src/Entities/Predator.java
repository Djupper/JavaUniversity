package Entities;

public abstract class Predator extends Animal {


    @Override
    public void eat() {
        System.out.println("Я ем других животнвх и иногда травку");
    }
}
