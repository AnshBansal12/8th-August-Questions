import java.util.Scanner;
public class Question7 {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer value");
        String n =sc.next();
        int decimal = Integer.parseInt(n, 2);
        System.out.println(n + " in binary = " + decimal + " in decimal.");

    }
}
