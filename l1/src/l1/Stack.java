package l1;

public class Stack{
    private Book book;
    private Category category;
    public Stack(Book book, Category category){
        this.book = book;
        this.category = category;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public  Category getCategory() {
        return category;
    }

    public void setCategory( Category category) {
        this.category = category;
    }
    public void print(){
        System.out.println(book.getClass() + " : " + book.getClass()  + " - " + category.getGenre() + " " + category.getType());
    }
}