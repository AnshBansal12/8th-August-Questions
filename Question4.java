import java.util.Scanner;
public class Question4 {
    public static void main(String[] arg){
Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st binary no.:");
        String x =sc.next();
        System.out.println("Enter the 2nd binary no.:");
        String y =sc.next();
    int n1=Integer.parseInt(x,2);
    int n2=Integer.parseInt(y,21);
    int n3=n1+n2;
        System.out.println("n1:"+Integer.toBinaryString(n1));
        System.out.println("n2:"+Integer.toBinaryString(n2));
        System.out.println("n1+n2:"+Integer.toBinaryString(n3));




    }
}
