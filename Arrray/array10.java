package Arrray;

public class array10 {
    public static void main(String[] args) {
        //10) Java Program to find the frequency of each element in the array

        int[] a = {1,2,3,2,3,1};
        int[] visited = new int[a.length];
        int visit = -1;
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
