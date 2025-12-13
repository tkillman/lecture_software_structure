package main.java.state_pattern;

public class EntryPoint {
    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(50);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
