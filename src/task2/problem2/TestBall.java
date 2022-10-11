package task2.problem2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5, 9);
        System.out.println(ball.getX() + " " + ball.getY());
        ball.setX(3);
        ball.setY (-1);
        System.out.println(ball.getX() + " " + ball.getY());
        ball.setXY(34,54);
        System.out.println(ball.getX() + " " + ball.getY());
        ball.move(3,-5);
        System.out.println(ball.toString());
    }
}
