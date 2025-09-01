package oop.lsp;

public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("Eagle walks on rocks.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars majestically.");
    }
}
