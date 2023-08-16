package NumberPrograms;

import java.util.Scanner;

public class number6 {
//    6) Java Program to Find Smallest of Three Numbers

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if(n1<n2 && n1<n3){
            System.out.println("smallest : "+n1);
        } else if (n2<n3) {
            System.out.println("smallest : "+n2);
        } else {
            System.out.println("smallest : "+n3);
        }
    }
}
