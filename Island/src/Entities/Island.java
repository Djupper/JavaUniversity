package Entities;

import java.util.ArrayList;

public class Island {
    private int height;
    private int weight;
    ArrayList[][] land = new ArrayList[height][weight];

    public Island(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void cell() {

        for (int i = 0; i < land.length ; i++) {
            for (int j = 0; j < land[i].length; j++) {


            }
        }
    }


}
