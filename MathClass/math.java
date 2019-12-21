package 课堂作业.Student.MathClass;
import java.math.*;
import java.util.Random;

public class math {
    public static void main(String argv[]){
        double a = 12.567;
        int b = (int) a;
        System.out.println("B :" + b);
        long c = Math.round(a);
        System.out.println("四舍五入 :" + c);
        double d = Math.floor(a);
        System.out.println("d :" + d);
        double e = Math.ceil(a);
        System.out.println("e :"+e);
        double f = Math.random();
        System.out.println("f :"+ f);
        System.out.println("0-99随机数："+ (int)(Math.random()*99));

        Random r = new Random(1153);
        System.out.println(r.nextInt(2));
    }
}
