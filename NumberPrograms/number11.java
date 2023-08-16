package NumberPrograms;

import java.util.Scanner;

public class number11 {

//    11) Java Program to find whether number is odd or even
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();
        if(n % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }


    }
}

