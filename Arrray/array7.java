package Arrray;

public class array7 {

    public static void main(String[] args) {
        //7) Java Program to sort the elements of an array in descending order

        int[] array ={1,4,2,3,2,6,9};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]<array[j]) {
                    int x=0;
                    x=array[i];
                    array[i]=array[j];
                    array[j]=x;
                }
            }
        }

        for (int j : array) {
            System.out.println(j);
        }

    }
}
