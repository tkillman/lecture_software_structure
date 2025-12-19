package s07_cor_pattern;

public class VicePresident extends Approver {

    private final double ALLOWABLE = 30 * base; // 30 * 500 = 15000

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("VicePresident will approve $"
                    + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }

}
