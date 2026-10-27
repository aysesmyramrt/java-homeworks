// HuntingDog.java
public class HuntingDog extends Dog {
    private int trackingSkill;
    private boolean trained;

    public HuntingDog(String name, String color, String breed, int trackingSkill) {
        super(name, color, breed);
        this.trackingSkill = trackingSkill;
        this.trained = false;
    }

    public void track() {
        System.out.println(getName() + " is tracking with skill level " + trackingSkill);
    }

    public void train() {
        trained = true;
        System.out.println(getName() + " has completed training!");
    }
}
