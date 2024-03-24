package String;

import java.util.Scanner;

public class String11 {
    // Reverse String in Java Word by Word
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split("\\s");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
