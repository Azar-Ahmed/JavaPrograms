public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1121,rev=0;
        int original = n;
        
        while (n>0) {
            rev = rev*10 + n%10;
            n = n/10;
        }
        if(rev == original){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");

        }

    
    }
}
