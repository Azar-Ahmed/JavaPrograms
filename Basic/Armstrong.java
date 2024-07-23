import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        int n = 153, armstrong = 0;
        double temp;
        int original = n;
       while (n>0) {
        temp = n%10;
        temp = Math.pow(temp, 3);
        armstrong += temp;
        n= n/10;
       }
       if(armstrong == original){
        System.out.println("Armstrong Number");
       }else{
        System.out.println("No an Armstrong Number");
       }
    }
}
