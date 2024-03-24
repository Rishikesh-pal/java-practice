package String;

import java.util.Scanner;

public class String3 {
//    Java Program to remove all the white spaces from a string
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String s = scanner.nextLine();
        System.out.println(s.replaceAll("\\s",""));

        char[] stringArray = s.toCharArray();
        StringBuffer strBuff = new StringBuffer();
        for(int i=0;i<stringArray.length;i++){
            if(stringArray[i]!=' ' && stringArray[i]!='/'+'t'){
                strBuff.append(stringArray[i]);
            }
        }
        String nospace = strBuff.toString();
        System.out.println(nospace);
    }
}
