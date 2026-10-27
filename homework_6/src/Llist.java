import java.util.Arrays;

// LList Class (Linked List Implementation)
class LList<T> {
    private Node firstNode; // Reference to first node
    private int numberOfEntries;

    private class Node {
        T data;
        Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LList() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        numberOfEntries++;
    }

    public void add(int position, T newEntry) {
        if (position >= 0 && position <= numberOfEntries) {
            Node newNode = new Node(newEntry);
            if (position == 0) {
                newNode.next = firstNode;
                firstNode = newNode;
            } else {
                Node currentNode = firstNode;
                for (int i = 0; i < position - 1; i++) {
                    currentNode = currentNode.next;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            numberOfEntries++;
        }
    }

    public T remove(int position) {
        if (position >= 0 && position < numberOfEntries) {
            T result;
            if (position == 0) {
                result = firstNode.data;
                firstNode = firstNode.next;
            } else {
                Node currentNode = firstNode;
                for (int i = 0; i < position - 1; i++) {
                    currentNode = currentNode.next;
                }
                result = currentNode.next.data;
                currentNode.next = currentNode.next.next;
            }
            numberOfEntries--;
            return result;
        }
        return null;
    }

    public T getEntry(int position) {
        if (position >= 0 && position < numberOfEntries) {
            Node currentNode = firstNode;
            for (int i = 0; i < position; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
        return null;
    }

    public boolean contains(T anEntry) {
        Node currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode.data.equals(anEntry)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[numberOfEntries];
        Node currentNode = firstNode;
        int index = 0;
        while (currentNode != null) {
            result[index++] = currentNode.data;
            currentNode = currentNode.next;
        }
        return result;
    }

    public int getSize() {
        return numberOfEntries;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}