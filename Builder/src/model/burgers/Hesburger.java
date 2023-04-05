package model.burgers;

public class Hesburger {
    private String bun = "";
    private String patty = "";
    private String lettuce = "";
    
    public void setBun(String bun) {
        this.bun = bun;
    }
    public void setPatty(String patty) {
        this.patty = patty;
    }
    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String toString(){
        return "A steaming hot Hesburger with a " + bun + " bun, " + lettuce + " lettuce and a patty made with: " + patty;
    }
}
