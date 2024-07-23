import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0, num;
        System.out.println("Enter Num");
        while (true) {
            num = sc.nextInt();
            if(num == 0) break;
            sum +=num;
        }
        System.out.println(sum);
    }
}
