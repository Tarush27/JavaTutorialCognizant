package queue;

import org.jetbrains.annotations.NotNull;

public class Book implements Comparable<Book> {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(@NotNull Book o) {
        return Integer.compare(id, o.id);
    }
}
