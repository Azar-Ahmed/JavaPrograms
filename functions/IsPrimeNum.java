package functions;

import java.util.Scanner;

public class IsPrimeNum {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int n = sc.nextInt();            
            sc.close();
            System.out.println(isPrime(n));
          }

        static boolean isPrime(int n){
            
            if(n<=1) return false;
            
            for (int i = 2; i < Math.sqrt(n); i++) {
                if(n%i==0){
                    return false;
                 }
            }

           return true;
        }

    
}
