package chapter9;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(){
        super ("Almond");
    }


    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
