package Arrray;

public class array11 {
//    java Program to print the duplicate elements of an array

    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,2,7,0,9};
        int count;
        System.out.println("Duplicate numbers are ->");

        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Break after printing duplicate once
                }
            }
        }
        System.out.println("Duplicate elements in the array are:");


    }
}
