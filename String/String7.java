package String;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        char[] str1 = str.toCharArray();
        int count;
        System.out.println("Duplicate char are:->  ");

        for (int i = 0; i < str1.length; i++) {
            count = 1;
            for (int j = i+1; j < str1.length; j++) {
                if (str1[i]==str1[j] && str1[i]!=' '){
                    count++;
                    str1[j] = '0';
                }
            }
            if (count>1 && str1[i]!='0'){
                System.out.println(str1[i]);
            }
        }
    }
}
