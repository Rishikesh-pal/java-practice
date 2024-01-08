package Arrray;

public class array6 {

    //6) Java Program to sort the elements of an array in ascending order


    public static void main(String[] args) {
//        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//        for(int i=0;i<4;i++){
//            for (int j = 0; j < 3 ; j++) {
//                System.out.print(array[i][j]);
//            }
//        }

//        int j[] = {2,6,10,1,9};
//        int k=0;
//        int m[] = new int[0];
//        for (int i = 0; i < j.length-1; i++) {
//            k=0;
//            if(j[i]>j[i+1]){
//                k=j[i];
//                m[i]=k;
//            }
//        }


        int[] a = {1,3,2,0,5,8,7};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int x=0;
                    x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
        System.out.println("Ascending");
        for (int j : a) {
            System.out.println(j);
        }
        System.out.println("Descending");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }

        System.out.println("odd position");
        for(int i=0;i<a.length;i=i+2)
        {
            System.out.println("element "+i + " : "+a[i]);
        }

        System.out.println("Even position");
        for(int i=1;i<a.length;i=i+2)
        {
            System.out.println("element "+i + " : "+a[i]);
        }

        System.out.println();
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("largest element is : "+max);

        System.out.println();
        System.out.println("even");
        for(int i=0;i<a.length;i++)
        {

            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }

        }
        System.out.println("Odd");
        for(int i=0;i<a.length;i++)
        {

            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }

        }

        int x[]=new int[a.length];
        for (int i=0;i<a.length;i++)
        {
            x[i]=a[i];
        }
        for(int i =0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }


    }
}
