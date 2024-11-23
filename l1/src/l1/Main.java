package l1;

import Excepition.DifferentsCategory;
import Excepition.FileNullException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) throws IOException {
        Book book = new Book("Пролятие", "ХЗ");
        Book B = new Book("1", "1");
        Book O = new Book("3", "2");
        Book K = new Book("4", "4");
        Category category = new Category("Ужастик", "Для взрослых");
        Category categor = new Category("Комедия", "Для взрослых");
        Stack stack = new Stack(book, category);
        Stack BO = new Stack(B, category);
        Stack OB = new Stack(O, category);
        Stack BOO = new Stack(K, categor);
        Literature manga = new Manga("Сао", "Хиоми", "Ангоинг");
        book.l();
        manga.l();

        List<Stack> AllBooks = Arrays.asList(stack, BO, OB, BOO);
        List<Stack> ListOfCategory1 = new ArrayList<>();

        for (Stack stack2 : AllBooks) {
            try {
                Category category1 = new Category("Ужастик", "Для взрослых");
                Librarian.isEqualsCategory(stack2.getCategory(), category1);
                ListOfCategory1.add(stack2);
            } catch (DifferentsCategory e) {
                System.out.println(e.getMessage());
            }
        }


        try {
            FileReader f = new FileReader("C:/Users/Павел/Desktop/l1/src/l1/testFile");

            Librarian.outLine(f);
        } catch (FileNullException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}