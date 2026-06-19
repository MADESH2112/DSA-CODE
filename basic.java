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


          //Write a program to check whether a triangle can be formed with the given values for the angles.
         Scanner scan=new Scanner(System.in);
         int angle1=scan.nextInt();
         int angle2=scan.nextInt();
         int angle3=scan.nextInt();
         if(angle1+angle2+angle3==18){
            System.out.println("Traingle can be formed");
         }
         else{
            System.out.println("Traingle cannot be formed");
         }

         //Write a program using switch case which takes a value and prints the respective Size.
//If size is 29 then its small
         Scanner sc2=new Scanner(System.in);
         int size=sc2.nextInt();
         switch(size){
            case 29:
                System.out.println("small");
                break;
            case 30:
                System.out.println("medium");
                break;
            case 38:
                System.out.println("large");
                break;
            case 42:
                System.out.println("x large");
                break;
            default:
                System.out.println("invalid");
                break;
         }
         }

    }


