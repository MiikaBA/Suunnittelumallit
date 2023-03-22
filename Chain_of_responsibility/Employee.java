package Chain_of_responsibility;

public class Employee {
    private double palkka = 1;
    public Employee(double palkka){
        this.palkka = palkka;
    }

    public double getPalkka(){return palkka;}

    public double getPalkkaKorotusP(double korotus){return korotus / palkka * 100;}


}
