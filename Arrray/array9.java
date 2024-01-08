package Arrray;

public class array9 {
    public static void main(String[] args) {
        //9) Java Program to copy all elements of one array into another array

        int []a = {1,4,5,6,7,3};
        int []x = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            x[i]=a[i];
        }

//        System.arraycopy(a, 0, x, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(x[i]);
        }
    }
}
