package l1;

public abstract class Main1 implements Literature{

    private String name;
    private String author;

    public Main1(String nam, String aut) {
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
    public String print(){
        return name + " " + author;
    }
}