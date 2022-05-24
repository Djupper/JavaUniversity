package Entities;

import java.util.Map;

public abstract class Animal {

    protected int mass;
    protected int priority;
    protected int max_move;
    protected int count_eaten;
    protected int count_move_for_eaten;

    public abstract void move();

    public abstract void eat();
    public abstract void die();

    public void reproduction() {

    }


}
