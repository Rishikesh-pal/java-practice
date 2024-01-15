package NumberPrograms;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        //Java Program to Display Prime Number
        int n1,n2,i,j;
        System.out.println("Print Numbers");
        Scanner scanner=new Scanner(System.in);
        n1=scanner.nextInt();
        n2=scanner.nextInt();
        for ( i = n1; i < n2; i++) {
            for ( j = 2; j <= n2; j++) {
                if (i%j==0)
                    break;
            }
            if (i==j)
                System.out.println(j);
        }
    }
}
