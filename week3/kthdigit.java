import java.util.Scanner;
public class kthdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        long power = 1;
        for (int i = 1; i <= B; i++) {
            power = power * A;
        }
        for (int i = 1; i < K; i++) {
            power = power / 10;
        }
        int digit = (int)(power % 10);
        System.out.println(digit);
    }
}