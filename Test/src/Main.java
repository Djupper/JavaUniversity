import Package1.Animal;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        Animal.pred = "Exampl";
        System.out.println( animal2.pred);


    }


}
