package L6.Test;

import L6.Classes.Book;
import L6.Classes.Category;
import L6.Comparator.AuthorComparator;
import L6.Comparator.NameComparator;
import L6.Comparator.SellCountComparator;
import L6.Comparator.TypeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test {
    Category category1 = new Category("qwe", "qwe", 12);
    Category category2 = new Category("qw", "qw", 123);
    Book book1 = new Book("qw","rt", category1);
    Book book2 = new Book("qw","rt", category1);
    Book book3 = new Book("qw","rt", category1);
    Book book4 = new Book("qwe","rte", category2);


    @Test
    public void equalsBook() {
        Assertions.assertEquals(book1, book1); //рефлексивность

        Assertions.assertEquals(book1, book2);//Симметричность
        Assertions.assertEquals(book2, book1);

        Assertions.assertEquals(book1, book2);//Транзитивность
        Assertions.assertEquals(book2, book3);
        Assertions.assertEquals(book1, book3);

        Assertions.assertEquals(book2, book3);//Постоянность
        Assertions.assertEquals(book2, book3);

        Assertions.assertEquals(book1, null);// неравенство с null
    }

    @Test
    public void hashCodeHuman(){
        Assertions.assertEquals(book1.hashCode(), book2.hashCode());//у равных объектов один hashCode
        Assertions.assertEquals(book2.hashCode(), book3.hashCode());
        Assertions.assertEquals(book1.hashCode(), book3.hashCode());
    }
    @Test
    public void sortCategory(){
        List<Category> CategoryList = Arrays.asList(category1,category2);
        Collections.sort(CategoryList);
    }

    @Test
    public void sortCategoryComparator(){
        List<Category> CategoryList = Arrays.asList(category1,category2);
        SellCountComparator sellCountComparator = new SellCountComparator();
        Collections.sort(CategoryList,sellCountComparator);

        TypeComparator typeComparator = new TypeComparator();
        Collections.sort(CategoryList, typeComparator);

    }

    @Test
    public void sortBook(){
        List<Book> BookList = Arrays.asList(book1,book2,book3,book4);
        Collections.sort(BookList);
    }

    @Test
    public void sortBookComparator(){
        List<Book> BookList = Arrays.asList(book1,book2,book3,book4);
        NameComparator nameComparator = new NameComparator();
        Collections.sort(BookList, nameComparator);

        AuthorComparator authorComparator = new AuthorComparator();
        Collections.sort(BookList,authorComparator);
    }

}