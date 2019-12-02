package Circle;

public class circle implements CalcArea {
    private final double pi = 3.1415926;
    private double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * pi;
    }
}
