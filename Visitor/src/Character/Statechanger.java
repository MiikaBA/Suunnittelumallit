package Character;

import Character.States.genState;

public class Statechanger implements Visitor{


    @Override
    public void visit(Character c) {
        if(c.getState().getDesc() == "Player just starting out"){
            c.setState(new genState("player midway to greatness"));
        }else if(c.getState().getDesc() == "player midway to greatness"){
            c.setState(new genState("Wow, max level good job"));
        }
    }
}
