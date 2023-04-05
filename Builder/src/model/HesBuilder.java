package model;

import model.burgers.Hesburger;

public class HesBuilder implements IBurgerBuilder{
    private Hesburger burger;

    @Override
    public void buildBun() {
        burger.setBun("Whole wheat");
        
    }

    @Override
    public void buildLettuce() {
        burger.setLettuce("Romaine");
        
    }

    @Override
    public void buildPatty() {
        burger.setPatty("99.9% Beef");
    }

    @Override
    public void createNewBurger() {
        burger = new Hesburger();
        
    }

    public Hesburger getBurger() {
        return burger;
    }
    
}
