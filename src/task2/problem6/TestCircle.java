package task2.problem6;

public class TestCircle {
    public static void main(String[] args) {
        Circle circleOne = new Circle(9, 8, 12);
        Circle circleTwo = new Circle(7, -9, 3);
        Circle circleThree = new Circle(1, 11, 3);
        System.out.println("Окружность 1\n"+ "Координаты центра: " + circleOne.getCX() + " " + circleOne.getCY() +
                "\nРадиус: " + circleOne.getRad() + "\nДлина окружности: " + circleOne.Perimeter() + "\nПлощадь: " +
                circleOne.Square());
        System.out.println("-".repeat(50));
        System.out.println("Окружность 2\n"+ "Координаты центра: " + circleTwo.getCX() + " " + circleTwo.getCY() +
                "\nРадиус: " + circleTwo.getRad() + "\nДлина окружности: " + circleTwo.Perimeter() + "\nПлощадь: " +
                circleTwo.Square());
        System.out.println("-".repeat(50));
        System.out.println("Окружность 3\n"+ "Координаты центра: " + circleThree.getCX() + " " + circleThree.getCY() +
                "\nРадиус: " + circleThree.getRad() + "\nДлина окружности: " + circleThree.Perimeter() + "\nПлощадь: " +
                circleThree.Square());
        System.out.println("-".repeat(50));
        System.out.println("Выводы:");
        if (circleOne.equals(circleTwo)){
            System.out.println("Окружности 1 и 2 равны");
        }
        else{
            System.out.println("Окружности 1 и 2 не равны");
        }
        if (circleTwo.equals(circleThree)){
            System.out.println("Окружности 2 и 3 равны");
        }
        else{
            System.out.println("Окружности 2 и 3 не равны");
        }
    }
}
