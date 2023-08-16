package NumberPrograms;

import java.util.Scanner;

public class Number9 {
//9) Java Program to Check if a Number is Positive or Negative
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");

        int number1 = scanner.nextInt();
        if(number1>0){
            System.out.println("positive");
        }
        if(number1<0) {
            System.out.println("negative");
        }
    }
}
