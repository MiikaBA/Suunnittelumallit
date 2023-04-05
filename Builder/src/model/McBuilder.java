package model;

import model.burgers.McDonalds;
import model.burgers.ingredients.Bun;
import model.burgers.ingredients.Lettuce;
import model.burgers.ingredients.Patty;

public class McBuilder implements IBurgerBuilder{
    private McDonalds burger;

    @Override
    public void buildBun() {
        burger.setBun(new Bun("Sesame"));
        
    }

    @Override
    public void buildLettuce() {
        burger.setLettuce(new Lettuce("Iceberg"));
    }

    @Override
    public void buildPatty() {
        burger.setPatty(new Patty("100% Beef"));
    }

    @Override
    public void createNewBurger() {
        burger = new McDonalds();
    }

    public McDonalds getBurger() {
        return burger;
    }
    
}
