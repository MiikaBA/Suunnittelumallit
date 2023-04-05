package model;

public class Waiter {
    private IBurgerBuilder burgerBuilder;

    public void setBurgerBuilder(IBurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public void constructBurger(){
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildLettuce();
        burgerBuilder.buildPatty();
    }
}
