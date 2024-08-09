package functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter No");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(EvenOddChecker(n));
    }
    static boolean EvenOddChecker(int n){
        if(n%2 == 0) return true;
        return false;
    }
}
