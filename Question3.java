import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
   Scanner sc= new Scanner (System.in);
   System.out.println("Enter the first value");
   int a =sc.nextInt();
        System.out.println("Enter the second value");
   int b=sc.nextInt();
   a=a+b;
   b=a-b;

   a=a-b;
        System.out.println("The swapped first value is");
        System.out.println(a);
        System.out.println("The swapped second value is");
        System.out.println(b);
    }
}
