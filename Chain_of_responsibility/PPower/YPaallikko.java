package Chain_of_responsibility.PPower;


public class YPaallikko extends PurchasePower {
    private final double ALLOWABLE = 2.5 * BASE;
    public void processRequest(RaiseRequest request) {if (request.getPalkkaKorotusP(request.getEmployeePay()) < ALLOWABLE) {
    System.out.println(
    "Yksikkö päällikkösi voi hyväksyä korotuksen: $" + request.getAmount());} else {
    super.processRequest(request);
    }
    }
    }