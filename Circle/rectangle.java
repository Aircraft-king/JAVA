package Circle;

public class rectangle implements CalcArea {
    private double lenth;
    private double width;

    rectangle(double lenth, double width) {
        this.lenth = lenth;
        this.width = width;
    }

    @Override
    public double getArea() {
        return lenth * width;
    }
}
