package Chain_of_responsibility.PPower;

public class Toimitusjohtaja extends PurchasePower {
    private final double ALLOWABLE = 50 * BASE;
    public void processRequest(RaiseRequest request) {if (request.getPalkkaKorotusP(request.getEmployeePay()) < ALLOWABLE) {
    System.out.println(
    "Vain Toimitusjohtaja voi hyväksyä korotuksen: $" + request.getAmount());} else{System.out.println("Bro mitä pirua sä pyydät??");}
    }
}
