package Ninjutsu;

public class Jutsu {
    private String[] handsign;

    public Jutsu(String signs) {
        String[] sign = signs.split(", ");
        this.handsign = sign;
    }

    public String[] getHandsign() {
        for (String seal:this.handsign) {
            System.out.println(seal);
        }
        return this.handsign;
    }

}
