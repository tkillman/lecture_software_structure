package main.java.cor_pattern;

public class VicePresident extends Approver {

    private final double ALLOWABLE = 30 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" +
                    request.getAmount());
        } else if (successor != null)
            successor.processRequest(request);
    }

}
