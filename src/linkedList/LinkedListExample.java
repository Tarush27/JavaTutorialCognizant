package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        linkedListBasicExample();
        llBasicOperations();
        linkedListOfObjects();
    }

    private static void linkedListOfObjects() {
        List<Book> list = new LinkedList<>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }

    private static void llBasicOperations() {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println(ll);

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("Geeks");
        ll1.add("Geeks");
        ll1.add(1, "Geeks");

        System.out.println("Initial LinkedList " + ll1);

        ll1.set(1, "For");

        System.out.println("Updated LinkedList " + ll1);

        LinkedList<String> ll2 = new LinkedList<>();

        ll2.add("Geeks");
        ll2.add("Geeks");
        ll2.add(1, "For");

        System.out.println(
                "Initial LinkedList " + ll2);

        ll2.remove(1);

        System.out.println(
                "After the Index Removal " + ll2);

        ll2.remove("Geeks");

        System.out.println(
                "After the Object Removal " + ll2);

        LinkedList<String> ll3
                = new LinkedList<>();

        ll3.add("Geeks");
        ll3.add("Geeks");
        ll3.add(1, "For");

        // Using the Get method and the
        // for loop
        for (String s : ll3) {

            System.out.print(s + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : ll3)
            System.out.print(str + " ");
    }

    private static void linkedListBasicExample() {
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
