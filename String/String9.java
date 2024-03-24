package String;

import java.util.Scanner;

public class String9 {
//    Java Program to separate the Individual Characters from a String

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        System.out.println("Individual characters are as follows:->");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

}
