package main.java.iterator_pattern;

public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern Example");

        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(cafeMenu, dinerMenu);
        waitress.printMenu();

    }
}
