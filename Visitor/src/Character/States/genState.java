package Character.States;

public class genState implements State{
    private String desc;

    public genState(String d){
        desc = d;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
