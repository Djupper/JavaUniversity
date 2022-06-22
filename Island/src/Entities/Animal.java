package Entities;


import Controller.Entity;

public abstract class Animal extends Entity {

    protected double mass; //масса животного (может меняться)

    protected double max_mass;//максимальная масса (неизменяемя величина)
    protected double max_eat;//кол-во еды максимально сьедаемой (неизменяемая величина)
    protected int priority; // приоритет
    protected int max_move; //
    protected double count_eaten;
    protected int count_move_for_eaten;

    @Override
    public String toString() {
        return "Animal{" +
                "mass=" + mass +
                ", max_mass=" + max_mass +
                ", max_eat=" + max_eat +
                ", priority=" + priority +
                ", max_move=" + max_move +
                ", count_eaten=" + count_eaten +
                ", count_move_for_eaten=" + count_move_for_eaten +
                ", isAlive=" + isAlive +
                ", animalType=" + animalType +
                '}';
    }

    public Animal(AnimalType animalType) {
        super(animalType);
    }
    public double getMax_mass() {
        return max_mass;
    }

    public void setMax_mass(double max_mass) {
        this.max_mass = max_mass;
    }

    public void setMax_eat(double max_eat) {
        this.max_eat = max_eat;
    }

    public double getMax_eat() {
        return max_eat;
    }

    public void setMax_eat(int max_eat) {
        this.max_eat = max_eat;
    }



    public abstract void eat();

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getMax_move() {
        return max_move;
    }

    public void setMax_move(int max_move) {
        this.max_move = max_move;
    }

    public double getCount_eaten() {
        return count_eaten;
    }

    public void setCount_eaten(double count_eaten) {
        this.count_eaten = count_eaten;
    }

    public int getCount_move_for_eaten() {
        return count_move_for_eaten;
    }

    public void setCount_move_for_eaten(int count_move_for_eaten) {
        this.count_move_for_eaten = count_move_for_eaten;
    }


    public void move() {
    }


    public void die() {

    }
    public void reproduction() {

    }


    public boolean whatToEat() {
        if (getMass() < getMax_mass()) {
            return true;
        } else
            return false;
    }


}
