package task1.Problem7;
import java.util.Scanner;

public class pr7 {
    public static int getFactor(int n) {
        int f = 1;
        for (int i = 1; i<=n; i++)
        {
            f *= i;
        }
        return (f);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        System.out.print ("Факториал числа: " + getFactor(n));
    }
}
