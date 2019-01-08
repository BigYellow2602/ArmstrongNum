package ArmstrongNum;

public class ArmstrongNum {
    public static void main(String[] args) {
        for(int i=1;i<=999;i++){
            int ge = i%10 ;
            int shi = (i/10)%10 ;
            int bai = i/100 ;

            int num = ge*ge*ge + shi*shi*shi + bai*bai*bai ;

            if(i == num)
            {
                System.out.printf("%d = %d ^ 3 + %d ^ 3 + %d ^ 3",num,bai,shi,ge);
                System.out.println();
            }
        }
    }
}
