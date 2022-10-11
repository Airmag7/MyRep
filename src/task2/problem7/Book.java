package task2.problem7;

public class Book {
    private String author;
    private String name;
    private int yearOfPublic;

    public Book(String author, String name, int yearOfPublic) {
        this.author = author;
        this.name = name;
        this.yearOfPublic = yearOfPublic;
    }

    public Book(){}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    public void setYearOfPublic(int yearOfPublic) {
        this.yearOfPublic = yearOfPublic;
    }

    public String toString(){
        return "Автор: " + author + "\nНазвание: " + name + "\nГод публикации: " + yearOfPublic;
    }
}
