import java.util.Scanner;

public class Question8 {
    public static void main(String[] args)
    {Scanner sc= new Scanner (System.in);
        System.out.println("Input any hexadecimal no.:");
        String n = sc.next();
        int num = Integer.parseInt(n,16);

        System.out.println("Decimal equivalent of given hex number: "+num);
    }
}