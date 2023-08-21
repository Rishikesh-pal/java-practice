package Arrray;

public class array8 {
    public static void main(String[] args) {
        int[] a = {1,4,2,5,6,8,11,17,68};
        System.out.println("even");
        for (int k : a) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
        System.out.println("odd");
        for (int j : a) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }
}
