package NumberPrograms;

import java.util.Scanner;

public class Number15 {
    public static void main(String[] args) {
        int term,a=0,b=1,c;
        System.out.println("enter iterations");
        Scanner scanner=new Scanner(System.in);
        term=scanner.nextInt();
        for (int i = 0; i < term; i++) {
            System.out.println(a);
            c=a+b;//1
            a=b;//1
            b=c;//1
        }
    }
}
