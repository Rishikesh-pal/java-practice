package NumberPrograms;

import java.util.Scanner;

public class number13 {
    public static void main(String[] args) {
//13) Java Program to Display Odd Numbers From 1 to 100

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();
        System.out.println("Odd numbers : ");
        for (int i = 1; i < n ; i+=2) {
            System.out.println(i);
        }
    }
}
