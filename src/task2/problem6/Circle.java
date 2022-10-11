package task2.problem6;

import java.util.Objects;

public class Circle {
    private double cX = 0.0;
    private double cY = 0.0;
    private double rad;

    public Circle(double cX, double cY, double rad) {
        this.cX = cX;
        this.cY = cY;
        this.rad = rad;
    }

    public double getCX() {
        return cX;
    }

    public void setCX(double cX) {
        this.cX = cX;
    }

    public double getCY() {
        return cY;
    }

    public void setCY(double cY) {
        this.cY = cY;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double Square() {
        return Math.PI * Math.pow(rad, 2);
    }

    public double Perimeter() {
        return 2 * Math.PI * rad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRad(), getRad()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRad());
    }
}