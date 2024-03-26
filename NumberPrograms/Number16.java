package NumberPrograms;

import java.util.Scanner;

public class Number16 {
    public static void main(String[] args) {
//        Java Program for Palindrome Number
        int  n,s=0,c,r;
        System.out.println("Enter any number");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        c=n;
        while (n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (c==s){
            System.out.println("Palaindrome");
        }
        else {
            System.out.println("Not Paaindrome");
        }
    }
}
