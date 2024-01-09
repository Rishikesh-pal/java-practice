package String;

public class String6 {
    public static void main(String[] args) {
        //6) Java Program to find Reverse of the string
        String x="Rishikesh";
        char[] y=x.toCharArray();
        for (int i = y.length-1; i>=0; i--) {
            System.out.print(y[i]);
        }
    }
}
