import java.util.Scanner;
public class Question5 {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer value");
        int n =sc.nextInt();

       String s="";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        System.out.println(s);


    }
}
