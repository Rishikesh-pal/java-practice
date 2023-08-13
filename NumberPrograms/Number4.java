package NumberPrograms;

import java.util.Scanner;

public class Number4 {

//    4) Java Program to Find Largest of Two Numbers
//    5) Java Program to Find Largest of Three Numbers
//    6) Java Program to Find Smallest of Three Numbers

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");

        int number1 = scanner.nextInt();
        System.out.println("entered 1st number is : "+number1);

        int number2 = scanner.nextInt();
        System.out.println("entered 2nd number is : "+number2);

        if(number1>number2){
            System.out.println("Greater of two number is : "+number1);
        }
        else if(number2>number1) {
            System.out.println("Greater of two number is : "+number2);
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
