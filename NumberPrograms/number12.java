package NumberPrograms;

import java.util.Scanner;

public class number12 {

//    12) Java Program to Display Even Numbers From 1 to 100
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();
        System.out.println("even nubers are : ");
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
    }
}
