package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        queueAsPriorityQueue();
        queueAsLinkedList();
        basicOperationsQueue();

    }

    private static void basicOperationsQueue() {
        Queue<Integer> q
                = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue "
                + q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-"
                + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-"
                + head);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-"
                + size);

        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);

        Queue<String> pq1 = new PriorityQueue<>();

        pq1.add("Geeks");
        pq1.add("For");
        pq1.add("Geeks");

        System.out.println("Initial Queue " + pq1);

        pq1.remove("Geeks");

        System.out.println("After Remove " + pq1);

        System.out.println("Poll Method " + pq1.poll());

        System.out.println("Final Queue " + pq1);

        Queue<String> pq2 = new PriorityQueue<>();

        pq2.add("Geeks");
        pq2.add("For");
        pq2.add("Geeks");

        for (String s : pq2) {
            System.out.print(s + " ");
        }
    }

    private static void queueAsLinkedList() {
        Queue<Integer> ll
                = new LinkedList<>();

        // Adding items to the ll
        // using add()
        ll.add(10);
        ll.add(20);
        ll.add(15);

        // Printing the top element of
        // the LinkedList
        System.out.println(ll.peek());

        // Printing the top element and removing it
        // from the LinkedList container
        System.out.println(ll.poll());

        // Printing the top element again
        System.out.println(ll.peek());
    }

    private static void queueAsPriorityQueue() {
        Queue<Integer> pQueue
                = new PriorityQueue<>();

        // Adding items to the pQueue
        // using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        for (String s : queue) {
            System.out.println(s);
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        for (String s : queue) {
            System.out.println(s);
        }

        Queue<Book> priorityQueueOfBook = new PriorityQueue<>();
        //Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        priorityQueueOfBook.add(b1);
        priorityQueueOfBook.add(b2);
        priorityQueueOfBook.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for (Book b : priorityQueueOfBook) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        priorityQueueOfBook.remove();
        System.out.println("After removing one book record:");
        for (Book b : priorityQueueOfBook) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
