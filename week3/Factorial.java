import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
        int fact=1;
        String res="";
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=num;i>=1;i--){
            fact=fact*i;
            if(i==1){
                res=res+i;
            }else
                res=res+i+"X";
        }
        System.out.print(res+"="+fact);

    }
}