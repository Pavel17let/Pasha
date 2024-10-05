package l1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Пролятие", "ХЗ");
        Category category = new Category("Ужастик", "Для взрослых");
        Stack stack = new Stack(book, category);
        Manga manga = new Manga("Сао", "Хиоми", "Ангоинг");
        stack.print();
        manga.print();
    }
}