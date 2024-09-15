import java.util.Scanner;
public class Question7 {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the binary no.");
        int n =sc.nextInt();
        int d=0,t=n,i=0;
        while(t>0)
        {
            int r=t%10;
            t/=10;
            d+=r*Math.pow(2,i++);
        }
        System.out.println( " Decimal equivalent of "+n+"is" + d );

    }
}
