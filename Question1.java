import java.util.Scanner;
public class Question1 {

public static void main(String[] args){
Scanner sc= new Scanner (System.in);
    System.out.println("Input word you want to reverse:");
    String n = sc.next();
    String str=n;
    String rev = (new StringBuilder(str)).reverse().toString();
    System.out.println(rev);
}}