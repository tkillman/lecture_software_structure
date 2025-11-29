package main.java.iterator_pattern;

public class IteratorPattner {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern Example");

        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();

    }
}
