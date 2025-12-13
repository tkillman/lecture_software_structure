package facade_pattern;

public class EntryPoint {

    public static void main(String[] args) {

        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }

}
