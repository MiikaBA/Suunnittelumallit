package Chain_of_responsibility.PPower;

public class Lahiesimies extends PurchasePower{
    private final double ALLOWABLE = BASE;
    public void processRequest(RaiseRequest request) {if (request.getPalkkaKorotusP(request.getEmployeePay()) < ALLOWABLE) {
    System.out.println(
    "Lähiesimiehesi voi hyväksyä korotuksen: $" + request.getAmount());} 
    else {
        super.processRequest(request);
    }
    }
}
