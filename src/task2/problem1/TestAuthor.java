package task2.problem1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Max", "airmag@inbox.ru", 'M');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        author.setEmail("airmag@inbox.ru");
        System.out.println(author.toString());
    }
}
