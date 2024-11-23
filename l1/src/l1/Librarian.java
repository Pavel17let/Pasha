package l1;

import Excepition.DifferentsCategory;
import Excepition.FileNullException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Librarian {
    public static void isEqualsCategory(Category main, Category second){
        if(!main.equals(second)) throw new DifferentsCategory("У книг разные категории");

    }

    public static void outLine(FileReader f) throws IOException {
        String line = readFile(f);
        if (line == null) throw new FileNullException("В файле нет данных");
        System.out.println(line);
    }
    public static String readFile(FileReader f) throws IOException {
        BufferedReader reader = new BufferedReader(f);
        return reader.readLine();
    }
}
