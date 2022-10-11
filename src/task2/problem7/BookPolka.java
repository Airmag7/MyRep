package task2.problem7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookPolka {
    private ArrayList<Book> books = new ArrayList<>();
    private int booksAmount = 0;

    public ArrayList<Book> getBooks() {
        return books;
    }
    public void addBook(Book book){
        books.add(book);
        booksAmount += 1;
    }
    public Book earliestBook(){
        int min = books.get(0).getYearOfPublic();
        Book minBook = new Book();
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getYearOfPublic() < min){
                min = books.get(i).getYearOfPublic();
                minBook = books.get(i);
            }
        }

        return minBook;
    }
    public Book latestBook(){
        int max = books.get(0).getYearOfPublic();
        Book maxBook = new Book();
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getYearOfPublic() > max){
                max = books.get(i).getYearOfPublic();
                maxBook = books.get(i);
            }
        }
        return maxBook;
    }
    public void sortBooks(){
        Comparator<Book> comparator = Comparator.comparing(Book::getYearOfPublic);
        books.sort(comparator);
    }
}