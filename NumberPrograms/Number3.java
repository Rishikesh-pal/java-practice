package NumberPrograms;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        double n=scanner.nextInt();
        double x, sq = n /2;
        do
        {
            x=sq;
            sq=(x+(n/x))/2;
        }
        while((x-sq)!=0);
        System.out.println("square root is " + sq);
    }
}
