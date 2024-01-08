package Arrray;

public class array12 {
    public static void main(String[] args) {
        //12) Java Program to Find 2nd Largest Number in an array
        //13) Java to Program Find 2nd Smallest Number in an array

        int []a={1,2,3,19,4,45,9};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int x=0;
                    x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
        for(int i : a){
            System.out.println(i);
        }
        System.out.println("Secound largest : "+a[a.length-2]);
        System.out.println("Secound smallest : "+a[1]);

    }
}
