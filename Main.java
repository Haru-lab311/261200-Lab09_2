package oop.lsp;

public class Main {
    public static void main(String[] args) {

        //creating different bird types
        //any subclass (Flyable or Moveable) can replace Moveable safely
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();

        //polymorphic calls
        sparrow.move();   // can be used as Flyable and Moveable
        eagle.move();     // can be used as Flyable and Moveable

        //Penguin and Ostrich has no fly() so that avoids runtime errors
        penguin.move();   // Moveable
        ostrich.move();   // Moveable

        //Flyable
        sparrow.fly(); // Only Flyable birds can fly, avoids runtime errors
        eagle.fly();//Only Flyable birds can fly

        //Flyable birds are also Moveable, so we can call move() safely
        //Flyable instances can be substituted wherever Moveable is expected
        sparrow.move();
        eagle.move();
    }
}
