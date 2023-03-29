package Character;

import Character.States.*;

public class Character {
    private State cState;
    private String name;

    public Character(State s, String n){
        cState = s;
        name = n;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public void setState(State newS){
        cState = newS;
    }

    public State getState(){
        return cState;
    }
}
