package Chain_of_responsibility.PPower;

import Chain_of_responsibility.Employee;

public class RaiseRequest {
    private double amount;
    private String purpose;
    private Employee emp;

    public RaiseRequest(double amount, String purpose, Employee e) {
        this.amount = amount;
        this.purpose = purpose;
        this.emp = e;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amt) {
        amount = amt;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String reason) {
        purpose = reason;
    }

    public double getPalkkaKorotusP(double palkka){
        return amount / palkka * 100;
    }

    public double getEmployeePay(){
        return emp.getPalkka();
    }
}