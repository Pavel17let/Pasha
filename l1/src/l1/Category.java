package l1;

import java.util.Objects;

public class Category{
    private String genre;
    private String type;

    public Category(String genr, String typ) {
        this.genre = genr;
        this.type = typ;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(genre, category.genre) && Objects.equals(type, category.type);
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