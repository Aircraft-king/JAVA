package change_case;

import java.util.Scanner;

public class change {
    private String str;
	

    change(String str){
        this.str = str;
    }

    public static String get_chang_case(String s){
        String str1 = s.toLowerCase();
        String str2 = s.toUpperCase();
        String newLetter = "";
        for (int i = 0;i < s.length();i++){
            if (s.substring(i,i+1).equals(str1.substring(i,i+1))){
                newLetter += str2.substring(i,i+1);
            }else {
                newLetter += str1.substring(i,i+1);
            }
        }
        return newLetter;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=scanner.next();
        System.out.println("转换后为："+get_chang_case(str));
    }
}

