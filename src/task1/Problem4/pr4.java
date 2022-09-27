package task1.Problem4;

import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum1 = 0, sum2 = 0;
        int i = 0;
        while (i < n) {
            sum1 += arr[i];
            i++;
        }
        int k = 0;
        do {
            sum2 += arr[k];
            k++;
        } while (k < n);
        int max = 0, min = arr[0];
        for(int j = 0; j < n; j++)
        {
            if(arr[j] < min)
            {
                min = arr[j];
            }
            if (arr[j] > max)
            {
                max = arr[j];
            }
        }
        System.out.println("Сумма элементов циклом while: " + sum1);
        System.out.println("Сумма элементов циклом do while: " + sum2);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.print("Минимальный элемент массива: " + min);
    }
}
