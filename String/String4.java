package String;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        //4) Java Program to replace lower-case characters with upper-case and vice-versa
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        System.out.println(chars);
    }

}
