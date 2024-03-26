package NumberPrograms;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
//        Java Program to Display Alternate Prime Numbers
        int n1,n2,i,j;
        System.out.println("Enter the two numbers");
        Scanner scanner=new Scanner(System.in);
        n1=scanner.nextInt();
        n2=scanner.nextInt();
        int count = 0;
        for ( i = n1; i < n2; i++) {
            for ( j = 2; j <= n2; j++) {
                if (i%j==0)
                    break;
            }
            if (i==j)
            {
                count++;
                if(count%2==1){
                    System.out.println(j);
                }
            }
        }
    }
}
