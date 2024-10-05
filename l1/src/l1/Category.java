package l1;

public class Category {
    private String genre;
    private String type;

    public Category(String genr, String typ) {
        this.genre = genr;
        this.type = typ;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void print(){
        System.out.println(genre + " " + type);
    }
}