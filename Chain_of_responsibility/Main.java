package Chain_of_responsibility;

import java.util.Scanner;

import Chain_of_responsibility.PPower.*;

public class Main {

    public static void main(String[] args) {
        Lahiesimies le = new Lahiesimies();
        YPaallikko yp = new YPaallikko();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        //PresidentPPower president = new PresidentPPower();
        le.setSuccessor(yp);
        yp.setSuccessor(tj);
        //vp.setSuccessor(president);

        Scanner sc = new Scanner(System.in);
        Employee emppu = new Employee(3250.0);
        // Press Ctrl+C to end.
        try {
            while (true) {
            System.out.println("Syötä toivottu korotuksen määrä.");System.out.print(">");
            double d = Double.parseDouble(sc.nextLine());
            le.processRequest(new RaiseRequest(d, "General", emppu));
            }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}