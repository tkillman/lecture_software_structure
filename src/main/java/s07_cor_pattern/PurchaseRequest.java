package s07_cor_pattern;

public class PurchaseRequest {
    private int requestType;
    private double amount;

    public PurchaseRequest(int requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public int getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
