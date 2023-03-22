package Chain_of_responsibility.PPower;

public abstract class PurchasePower {
    protected static final double BASE = 2;
    private PurchasePower successor;
    public void setSuccessor(PurchasePower successor) {
    this.successor = successor;
    }
        public void processRequest(RaiseRequest request){
            if (successor != null)
                successor.processRequest(request);
        }
}
