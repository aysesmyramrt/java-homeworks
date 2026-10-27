import java.util.Arrays;

public class LListTest {
    public static void main(String[] args) {
        LList<Integer> list = new LList<>();

        System.out.println("Testing isEmpty(): " + list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List after adding elements: " + list);

        list.add(1, 15);
        System.out.println("After inserting 15 at index 1: " + list);

        System.out.println("Removing element at index 2: " + list.remove(2));
        System.out.println("List after removal: " + list);

        System.out.println("Element at index 1: " + list.getEntry(1));

        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Contains 50? " + list.contains(50));

        System.out.println("Converting list to array: " + Arrays.toString(list.toArray()));

        list.clear();
        System.out.println("List after clear: " + list.isEmpty());
    }
}
