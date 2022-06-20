package Entities;

public enum AnimalType {


    WOLF_TYPE(0),

    SNAKE_TYPE(1),

    FOX_TYPE(2),
    BEAR_TYPE(3),

    HOKE_TYPE(4),

    HORSE_TYPE(5),

    DEER_TYPE(6),
    RABBIT_TYPE(7),

    HAMSTER_TYPE(8),

    GOAT_TYPE(9),

    SHIP_TYPE(10),

    KANGAROO_TYPE(11),

    COW_TYPE(12),

    DUCK_TYPE(13),

    CATERPILLAR_TYPE(14),

    PLANT_TYPE(15);

    public final int id;

    AnimalType(int id) {
        this.id = id;
    }

}
