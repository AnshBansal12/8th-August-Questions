import java.util.Scanner;
import java.lang.*;
public class Question8 {
    public static void main(String[] args)
    {Scanner sc= new Scanner (System.in);
        System.out.println("Input any hexadecimal no.:");
        String n = sc.nextLine();
        int des=0;
        int j=0;
        int len=n.length();
        for(int i=len-1;i>=0;i--)
        {if(n.charAt(i)>='0'&& n.charAt(i)<='9')
        {des+=((n.charAt(i)-48)*Math.pow(16,j));
                j++;}
            else if(n.charAt(i)>='A'&& n.charAt(i)<='F')
            {des+=((n.charAt(i)-55)*Math.pow(16,j));
                j++;
            }
        }


        System.out.println("Decimal equivalent of "+n+" number:" +des);
    }
}