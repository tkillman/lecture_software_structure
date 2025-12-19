package s07_cor_pattern;

public class Director extends Approver {

    private final double ALLOWABLE = 20 * base; // 20 * 500 = 10000

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Director will approve $" +
                    request.getAmount());
        } else if (successor != null)
            successor.processRequest(request);
    }

}
