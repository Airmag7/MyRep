package task2.problem7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("И. А. Гончаров",
            "Обломов",
            1859);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYearOfPublic());
        book.setName("Обрыв");
        book.setYearOfPublic(1869);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYearOfPublic());

        BookPolka bookPolka = new BookPolka();

        bookPolka.addBook(book);
        bookPolka.addBook(new Book("Стивен Кинг", "Мизери", 1987));
        bookPolka.addBook(new Book("Стивен Кинг", "Зеленая миля", 1996));

        System.out.println("-".repeat(50));

        for (int i = 0; i < bookPolka.getBooks().size(); i++) {
            System.out.println(bookPolka.getBooks().get(i).toString());
        }

        System.out.println("-".repeat(50));

        System.out.println("Самая ранняя: " + bookPolka.earliestBook().toString());
        System.out.println("Самая последняя: " + bookPolka.latestBook().toString());

        System.out.println("-".repeat(50));

        bookPolka.sortBooks();

        for (int i = 0; i < bookPolka.getBooks().size(); i++) {
            System.out.println(bookPolka.getBooks().get(i).toString());
        }
}
}
