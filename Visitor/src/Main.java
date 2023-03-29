import Character.Character;
import Character.Statechanger;
import Character.Visitor;
import Character.States.sState;

public class Main {
    public static void main(String[] args) {
        Character pekka = new Character(new sState(), "pekka");
        System.out.println(pekka.getState().getDesc());

        Visitor tasoMuuttaja = new Statechanger();
        pekka.accept(tasoMuuttaja);
        System.out.println(pekka.getState().getDesc());
    }
}
