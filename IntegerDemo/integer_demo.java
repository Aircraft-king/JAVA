package 课堂作业.Student.IntegerDemo;
import java.math.BigDecimal;
import java.util.Scanner;
public class integer_demo {

    public static void main(String args[]){
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int number = 100;
        String s1 = ""+number;
        System.out.println("s1 : " + s1);

        String s2 = String.valueOf(number);
        System.out.println("s2 : " + s2);

        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3 : "+s3);

        String s4 = Integer.toString(number);
        System.out.println("s4 : "+ s4);

        String s = new String("1000");
        Integer a = new Integer(s);
        int x = a.intValue();
        System.out.println("x : "+x);

        int y = Integer.parseInt(s);
        System.out.println("y : "+y);

        System.out.println(Integer.parseInt("-FF",16));
        System.out.println(Integer.parseInt("255",8));

        System.out.println(Integer.toString(number,2));
        System.out.println(Integer.toString(number,8));
        System.out.println(Integer.toString(number,10));
        System.out.println(Integer.toString(number,16));

        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('0'));

        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('0'));

        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('0'));

        String ss = new String("abcABC123");
        int small = 0;
        int big = 0;
        int num = 0;
        for(i=0;i<ss.length();++i){
            if(ss.charAt(i)<='z'&&ss.charAt(i)>='a'){
                small++;
            }
            if(ss.charAt(i)<='Z'&&ss.charAt(i)>='A'){
                big++;
            }
            if(ss.charAt(i)<='9'&&ss.charAt(i)>='0'){
                num++;
            }
        }
        System.out.println("小写字母个数 : "+small+" 大写字母个数 : "+big+" 数字个数 : "+num);

        int[] in = new int[3];
        for(i=0;i<in.length;++i)
        {
            in[i]=i;
        }
        for (i=0;i<in.length;++i){
            System.out.println(in[i]);
        }
        System.out.println(1.301/100);

        BigDecimal bd1 = new BigDecimal("1.0301");
        BigDecimal bd2 = new BigDecimal("100");
        System.out.println(bd1.divide(bd2));

    }
}
