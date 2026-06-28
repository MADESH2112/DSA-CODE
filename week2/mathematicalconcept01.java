//find last digit of a number
public class mathematicalconcept01{
    public static void main(String[]args){
        int n=4235;
        while(n>0){
            int id=n%10;
            System.out.println(id);
            n=n/10;
        }
    }
}