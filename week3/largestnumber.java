public class largestnumber{
    public static void main(String[]args){
        int[]num={12,23,33,25,44};
        int largest=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.print(largest);
}
    }
