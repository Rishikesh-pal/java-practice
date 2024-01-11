package NumberPrograms;

public class Number21 {
    public static void main(String[] args) {
        //21) Java Program to Find Largest of Four Numbers (use AND/OR Operator)

        int a=108,b=1009,c=3000,d=400000;
        if (a>b && a>c && a>d ){
            System.out.println(a+" largest");
        } else if (b>c && b>d && b>a)  {
            System.out.println("largest : "+b);
        } else if (c>a && c>b && c>d) {
            System.out.println("largest : "+c);
        }
        else {
            System.out.println("largest : "+d);
        }
    }
}
