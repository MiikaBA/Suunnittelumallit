package Character.States;

public class sState implements State {
    private String desc;

    public sState(){
        desc = "Player just starting out";
    }

    @Override
    public String getDesc(){
        return desc;
    }


}
