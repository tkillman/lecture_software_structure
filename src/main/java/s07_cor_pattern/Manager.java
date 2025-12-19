package s07_cor_pattern;

public class Manager extends Approver {

    private final double ALLOWABLE = 10 * base; // 5000

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" +
                    request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
            
    }

}
