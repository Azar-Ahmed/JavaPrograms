package functions;

import java.util.Scanner;

public class MinMaxCalculator  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Enter num3");
        int num3 = sc.nextInt();
        
       minNumber(num1, num2, num3);
       maxNumber(num1, num2, num3);
    }

    static void minNumber(int n1, int n2, int n3){
        int min = n2;

        if(n2 < min){
            min = n2;
        }else if (n3 < min){
            min = n3;
        }
        System.out.println("Min Num : " + min);
    }
    static void maxNumber(int n1, int n2, int n3){
        int max = n1;
        if(n2 > max){
            max = n2;
        }else if(n3 > max){
            max = n3;
        }
        System.out.println("Max Num : " + max);
    }
}
