package NumberPrograms;

import java.util.Scanner;

public class Number5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");

        int number1 = scanner.nextInt();
        System.out.println("entered 1st number is : "+number1);

        int number2 = scanner.nextInt();
        System.out.println("entered 2nd number is : "+number2);

        int number3 = scanner.nextInt();
        System.out.println("entered 3rd number is : "+number3);

        if (number1>number2){
            if(number1>number3){
                System.out.println("Greatest : "+number1);
            }
            if (number2>number3) {
                System.out.println("Greatest : "+number2);
            }
        } else if (number2>number3) {
            System.out.println("Greatest : "+number2);
        } else {
            System.out.println("Greatest : "+number3);
        }
    }
}
