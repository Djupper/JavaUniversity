package Controller;

import Entities.Animal;
import Entities.AnimalType;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class EatDecider {
    RandomGenerator generator = new Random();
    Integer[][] listProbability;
    public EatDecider() {
        listProbability = new Integer[][]{
                new Integer[]{0, 10, 10, 0, 10, 30, 40, 70, 90, 60, 70, 20, 30, 80, 0, 0},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 50, 90, 0, 0, 0, 0, 50, 90, 0},
                new Integer[]{0, 20, 0, 0, 10, 0, 5, 0, 70, 90, 20, 20, 5, 0, 80, 0, 0},
                new Integer[]{20, 30, 20, 0, 30, 70, 80, 80, 90, 70, 70, 60, 75, 80, 0, 0},
                new Integer[]{0, 50, 0, 0, 0, 0, 0, 90, 90, 0, 0, 0, 0, 85, 20, 0},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 100},
                new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
        };
    }
    public boolean willEat(AnimalType hunter, AnimalType victim) {

        final int priorityFact = generator.nextInt(100);
        final int priorityTable = getPriority(hunter, victim);
        return priorityFact < priorityTable;
    }
    public int getPriority(AnimalType hunter, AnimalType victim) {
        int i = hunter.id;
        final int j = victim.id;
        return listProbability[i][j];
    }

}
