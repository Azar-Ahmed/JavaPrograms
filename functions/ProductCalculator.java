package functions;

import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Number 1");
         int n1 = sc.nextInt();
         
         System.out.println("Enter Number 2");
         int n2 = sc.nextInt();

         sc.close();

         int product = getProduct(n1, n2);
        System.out.println("Product is : " + product);
    }

    static int getProduct(int n1, int n2){
        return n1 * n2;
    }
}
