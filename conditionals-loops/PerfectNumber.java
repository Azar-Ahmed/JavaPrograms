public class PerfectNumber {
    public static void main(String[] args) {
        int n = 26, res =0 ;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                res = res +i;
            }
        }
        if(n == res){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
           
    }
}
