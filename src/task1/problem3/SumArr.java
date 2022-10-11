package task1.problem3;
import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.print("Среднее арифметическое элементов: " + (sum/n));
    }
}
