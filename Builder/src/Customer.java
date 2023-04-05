import model.HesBuilder;
import model.McBuilder;
import model.Waiter;
import model.burgers.Hesburger;
import model.burgers.McDonalds;

public class Customer {
    public static void main(String[] args) {

        //String toteutus
        Waiter waiter = new Waiter();

        HesBuilder bBuilder = new HesBuilder();

        waiter.setBurgerBuilder(bBuilder);
        waiter.constructBurger();

        Hesburger burger = bBuilder.getBurger();

        System.out.println(burger);

        //Olio toteutus
        McBuilder mcBuilder = new McBuilder();

        waiter.setBurgerBuilder(mcBuilder);
        waiter.constructBurger();

        McDonalds bursa = mcBuilder.getBurger();

        System.out.println(bursa);
    }
}
