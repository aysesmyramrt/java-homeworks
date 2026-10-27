// Dog.java
public class Dog {
    private String name;
    private String color;
    private String breed;
    private boolean hungry;

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.hungry = true;
    }

    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public void fetch(String item) {
        System.out.println(name + " is fetching the " + item);
    }

    public void wagTail() {
        System.out.println(name + " is wagging their tail happily!");
    }

    public void feed() {
        if (hungry) {
            hungry = false;
            System.out.println(name + " has been fed and is happy!");
        } else {
            System.out.println(name + " is not hungry right now.");
        }
    }

    public String getName() { return name; }
    public String getColor() { return color; }
    public String getBreed() { return breed; }
    public boolean isHungry() { return hungry; }
}
