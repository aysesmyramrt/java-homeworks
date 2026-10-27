// ServiceDog.java
public class ServiceDog extends Dog {
    private String specialization;
    private boolean onDuty;

    public ServiceDog(String name, String color, String breed, String specialization) {
        super(name, color, breed);
        this.specialization = specialization;
        this.onDuty = false;
    }

    public void startWork() {
        onDuty = true;
        System.out.println(getName() + " is now on duty as a " + specialization + " service dog.");
    }

    public void assist() {
        if (onDuty) {
            System.out.println(getName() + " is providing " + specialization + " assistance.");
        } else {
            System.out.println(getName() + " is off duty right now.");
        }
    }
}
