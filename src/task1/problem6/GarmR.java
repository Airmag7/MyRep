package task1.problem6;

public class GarmR {
    public static void main(String[] args) {
        double num;
        System.out.print ("Гармонический ряд: ");
        for (int i = 1; i < 11; i++)
        {
            num = 1./i;
            System.out.format("%.2f",num);
            System.out.format(" ");
        }
    }
}
