package L6.Classes;

import java.util.Objects;

public class Category implements Comparable<Category> {
    private String genre;
    private String type;
    private int sellCount;

    public Category(String genre, String type, int sellCount) {
        this.genre = genre;
        this.type = type;
        this.sellCount = sellCount;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return type;
    }

    public int getSellCount() {
        return sellCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return sellCount == category.sellCount && Objects.equals(genre, category.genre) && Objects.equals(type, category.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, type, sellCount);
    }

    @Override
    public int compareTo(Category o) {
        return this.genre.compareTo(o.genre);
    }
}
