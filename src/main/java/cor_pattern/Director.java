package cor_pattern;

public class Director extends Approver {

    private final double ALLOWABLE = 20 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" +
                    request.getAmount());
        } else if (successor != null)
            successor.processRequest(request);
    }

}
