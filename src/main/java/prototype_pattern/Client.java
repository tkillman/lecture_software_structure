package main.java.prototype_pattern;

public class Client {
    private Prototype prototype = new Prototype();

    public void op() {
        Prototype clone = prototype.clone();
    }
}
