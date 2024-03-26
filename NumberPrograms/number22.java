package NumberPrograms;

import java.util.Scanner;

public class number22 {
    //22) Java Program to Display Prime Numbers between 1 and 100

    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    //A prime number is a positive integer greater than 1 that is only divisible by itself and 1.
    // Prime numbers have exactly two factors: 1 and the number itself
    public static void main(String[] args) {
        int n1,n2,i,j;
        n1=0;
        n2=100;
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
