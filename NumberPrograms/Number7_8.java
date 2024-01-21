package NumberPrograms;

import java.util.Scanner;

public class Number7_8 {
    public static void main(String[] args) {
        int a,b,gcd = 0;
        System.out.println("Enter any two Numbers");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        for (int i = 1; i <= a && i<=b; i++) {
            if (a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm = (a*b)/gcd;
        System.out.println("LCM is : "+lcm);
        System.out.println("GCD is : "+gcd);
    }
}
