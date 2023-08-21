package Arrray;

public class array4 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 6, 3, 9, 11};
        for (int i=0;i<=a.length-1;i++){
            if (i%2!=0) {
                System.out.println(a[i]);
            }
        }
    }
}
