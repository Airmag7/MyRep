package task2.Problem3;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        int circlesCount;
        Scanner in = new Scanner(System.in);
        circlesCount = in.nextInt();

        for(int i = 0; i< circlesCount; i++)
        {
            circles.add(new Circle(new Point (i/2.0, i / 3.0), i + 1.5));
        }
        for(int i = 0; i< circlesCount; i++)
        {
            System.out.println(circles.get(i).toString());
        }
        for (int i = 0; i < circlesCount; i++)
        {
            circles.get(i).move(new Point (i + 1, i + 1));
            System.out.println(circles.get(i).toString());
        }
    }
}
