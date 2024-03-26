package NumberPrograms;

import java.util.Scanner;

public class Number18 {
    public static void main(String[] args) {
//        Java Program for Armstrong Number in Java
        int n = 0,arm=0,rem,c;
        System.out.println("Enter any number : ..");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        c=n;
        while (n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(  c==arm )
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong");
    }
}
