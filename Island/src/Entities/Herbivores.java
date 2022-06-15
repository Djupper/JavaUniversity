package Entities;

public abstract class Herbivores extends Animal{


    @Override
    public void eat() {
        System.out.println("Я кушаю травку!");
    }
}
