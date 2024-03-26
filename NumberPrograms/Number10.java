package NumberPrograms;

import java.util.Scanner;

public class Number10 {
//    Java Program to Check if a Given Number is Perfect Square

    public static void main(String[] args) {
        System.out.println("Enter any number:->");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble(),
                sq,
                x=0;
        for (int i = 1; i < n; i++) {
            sq = i*i;
            if(sq==n){
                x=1;
            }
        }
        if (x==1)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");
    }
}
