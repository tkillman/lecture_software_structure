package main.java.cor_pattern;

public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Chain of Responsibility Pattern Example");
        Manager manager = new Manager();
        Director director = new Director();
        VicePresident vp = new VicePresident();
        President president = new President();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        while (true) {
            double d = GetAmount2GetApproved();
            manager.processRequest(new PurchaseRequest(0, d));
        }

    }

    private static double GetAmount2GetApproved() {
        return Math.random() * 10000;
    }
}
