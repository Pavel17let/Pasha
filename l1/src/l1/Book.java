package l1;
public class Book extends Main1 {
    private String name;
    private String author;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Book(String nam, String aut) {
    super(nam, aut);
    }
    @Override
    public void l() {
        System.out.println("Книга: " + print());
    }
}