// DogDemo.java
public class DogDemo {
    public static void main(String[] args) {
        Dog buddy = new Dog("Buddy", "Golden", "Labrador Retriever");
        HuntingDog hunter = new HuntingDog("Scout", "Brown", "Bloodhound", 95);
        ServiceDog helper = new ServiceDog("Luna", "Black", "German Shepherd", "Guide Dog");

        System.out.println("\n=== Regular Dog Demo ===");
        buddy.bark();
        buddy.fetch("ball");
        buddy.wagTail();
        buddy.feed();

        System.out.println("\n=== Hunting Dog Demo ===");
        hunter.bark();
        hunter.track();
        hunter.train();
        hunter.fetch("duck toy");

        System.out.println("\n=== Service Dog Demo ===");
        helper.startWork();
        helper.assist();
        helper.wagTail();
        helper.feed();
    }
}
