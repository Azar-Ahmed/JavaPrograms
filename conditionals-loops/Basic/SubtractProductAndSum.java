public class SubtractProductAndSum {
    public static void main(String[] args) {
        int n = 234,sum =0, product =1, res= 0;

        while (n>0) {
                int temp = n%10;
                n = n/10;
                sum += temp;
                product *=temp;
        }
        res = product - sum ;
        System.out.println(res);

    }
}