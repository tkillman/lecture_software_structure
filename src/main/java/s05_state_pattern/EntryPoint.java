package s05_state_pattern;

public class EntryPoint {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(50);
        
        for (int i = 0; i < 10; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println("-----");
        }
    }
}
