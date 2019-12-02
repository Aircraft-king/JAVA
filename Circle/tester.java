package Circle;

public class tester {
    static CalcArea[] shapes = {new circle(1.0),new
            rectangle(3.0,4.0),new circle(8.0)};

    public static void main(String[] args){
        System.out.println("total area = "+sumArea(shapes));
    }

    public static double sumArea (CalcArea[] shapes){
        double sum = shapes[0].getArea() + shapes[1].getArea() +shapes[2].getArea();
        return sum;
    }
}
