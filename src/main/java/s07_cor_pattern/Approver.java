package s07_cor_pattern;

abstract class Approver {
    protected final double base = 500;
    protected Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}