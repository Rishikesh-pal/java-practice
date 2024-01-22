package String;

import java.util.Locale;
import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        int vouvels = 0, consnent = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vouvels++;
            }
            else if (s.charAt(i)>='a' || s.charAt(i)<='z'){
                consnent++;

            }
        }
        System.out.println("vouvels : "+vouvels);
        System.out.println("Comsonents : "+consnent);

    }
}
