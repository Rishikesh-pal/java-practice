package Arrray;

public class array5 {
    public static void main(String[] args) {
        int[] a ={10,4,22,3,1,50,100,2,-9};
        int b=a[0];
        for (int i = 1; i < a.length ; i++) {
            if (b<a[i]){
                b=a[i];
            }
        }
        System.out.println(b);
    }
}
