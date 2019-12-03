package Binary_conversion;

import java.math.BigInteger;

public class bin {
    public static void main(String arge[]){
        int i = -1234567;
        String s=String.valueOf(i);
        BigInteger b=new BigInteger(s);
        System.out.println("二进制："+b.toString(2));
        System.out.println("八进制："+b.toString(8));
        System.out.println("十六进制："+b.toString(16));
    }
}
