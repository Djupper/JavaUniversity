package Entities;

public abstract class Animal {

    protected int mass;
    protected int priority;
    protected int max_move;
    protected int count_eaten;
    protected int count_move_for_eaten;
    protected int count_max_eat;
    //переменная в которую помещается значение голодное ли животное
    public int hunger;


    public abstract void move();

    public abstract void eat(Object victim);
    public abstract void die();

    public void reproduction() {

    }


}
