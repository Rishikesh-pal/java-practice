package NumberPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Number17 {
    public static void main(String[] args) {
//        Java Program for Factorial of any number
        int n,k=1;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            k=k*i;
        }

        System.out.println("Factorial is : "+k);
    }
}
