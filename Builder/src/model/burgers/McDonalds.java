package model.burgers;

import model.burgers.ingredients.*;

public class McDonalds {
    private Bun bun;
    private Lettuce lettuce;
    private Patty patty;
    
    public void setBun(Bun bun) {
        this.bun = bun;
    }
    public void setLettuce(Lettuce lettuce) {
        this.lettuce = lettuce;
    }
    public void setPatty(Patty patty) {
        this.patty = patty;
    }

    public String toString(){
        return "A delicious McDonalds burger with a " + bun.getType() + " bun, " + lettuce.getType() + " lettuce and a patty made with: " + patty.getType();
    }
}
