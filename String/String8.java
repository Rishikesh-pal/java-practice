package String;

import java.util.Scanner;

public class String8 {
//    Java Program to find the frequency of characters


    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        char[] a = s.toCharArray();
        int visit = -1;
        int[] visited = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count =1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                    visited[j]=visit;
                }
            }
            if (visited[i]!=visit){
                visited[i]=count;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if(visited[j]!=visit)
                System.out.println("frequency of "+a[j]+" is "+visited[j]);
        }
    }
}
