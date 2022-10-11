package task1.problem5;

public class CommandArgs {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки: ");
        for (int i = 0; i < args.length; i++)
        {
            System.out.print(args[i] + " ");
        }
    }
}
