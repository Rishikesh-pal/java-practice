package String;

import java.util.Scanner;

public class String5 {
    // 5) Java Program to replace the spaces of a string with a specific character
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(s.replace(' ','-'));
    }
}
