package l1;
public class Book {
    private String name;
    private String author;

    public Book(String nam, String aut) {
        this.name = nam;
        this.author = aut;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = this.name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void print(){
        System.out.println(name + " " + author);
    }
}