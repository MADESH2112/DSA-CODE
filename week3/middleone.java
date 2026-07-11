import java.util.Scanner;
public class middleone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        System.out.print("Enter C: ");
        int C = sc.nextInt();
        int middle;
        if (A > B && A > C) {
            middle = (B > C) ? B : C;
        } 
        else if (B > A && B > C) {
            middle = (A > C) ? A : C;
        } 
        else {
            middle = (A > B) ? A : B;
        }
        System.out.println("Middle Number = " + middle);
    }
}