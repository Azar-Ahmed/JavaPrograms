import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sumOfNegetiveNum = 0;
        int sumOfPositiveEvenNum = 0;
        int sumOfPosiveOddNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        while (true) {
            int num = sc.nextInt();
            if(num == 0){
                break;
            }else if (num < 0){
                sumOfNegetiveNum += num;
            }else if(num >0 &&num%2 == 0){
                sumOfPositiveEvenNum += num;
            }else if(num >0 && num%2 != 0){
                sumOfPosiveOddNum += num;
            }

        }
        System.out.println("Sum of negative numbers: " + sumOfNegetiveNum);
        System.out.println("Sum of positive even numbers: " + sumOfPositiveEvenNum);
        System.out.println("Sum of positive odd numbers: " + sumOfPosiveOddNum);


    }
}
