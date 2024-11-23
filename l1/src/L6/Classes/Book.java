package L6.Classes;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private Category category;

    public Book(String name, String author, Category category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(category, book.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, category);
    }

    @Override
    public int compareTo(Book o) {
        return this.category.compareTo(o.category);
    }
}