package Entities;


import Controller.Entity;

public abstract class Animal extends Entity {

    protected int mass;
    protected int priority;
    protected int max_move;
    protected int count_eaten;
    protected int count_move_for_eaten;

    public Animal(AnimalType animalType) {
        super(animalType);
    }

    public int getMax_eat() {
        return max_eat;
    }

    public void setMax_eat(int max_eat) {
        this.max_eat = max_eat;
    }

    protected int max_eat;

    public abstract void eat();

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
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

    public int getCount_eaten() {
        return count_eaten;
    }

    public void setCount_eaten(int count_eaten) {
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


    @Override
    public String toString() {
        return "Animal{" +
                "mass=" + mass +
                ", priority=" + priority +
                ", max_move=" + max_move +
                ", count_eaten=" + count_eaten +
                ", count_move_for_eaten=" + count_move_for_eaten +
                '}';
    }


}
