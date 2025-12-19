package s07_cor_pattern;

public class President extends Approver {

    private final double ALLOWABLE = 40 * base; // 40 * 500 = 20000

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("President will approve $" +
                    request.getAmount());
        } else if (successor != null)
            successor.processRequest(request);
    }
}
