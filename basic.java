//addition
import java.util.Scanner;
public class basic{
    public static void main(String[]args)
    {
        int num1=20;
        int num2=30;
        int sum=num1+num2;
        System.out.println("sum = "+sum);
        
        // Write a program that takes an integer, then a string, then a char from the user and print.
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String name=sc.next();
        char ch=sc.next().charAt(0);
         System.out.println(num);
          System.out.println(name);
          System.out.println(ch);

    }
}

