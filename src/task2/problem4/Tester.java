package task2.problem4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String motherboard;
        String CPU;
        int ram;

        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);

        shop.add(new Computer("Elbrus112", "MSI", "Intel I7 8700", 16));

        System.out.print("Motherboard: ");
        motherboard = in.nextLine();
        System.out.print("CPU: ");
        CPU = in.nextLine();
        System.out.print("Ram: ");
        ram =  in.nextInt();

        System.out.println(shop.find(motherboard, CPU, ram));
    }
}
