import java.util.Scanner;

public class AvgOfN {
    public static void main(String[] args) {
        int count;
        System.out.println("Enter Count of Number");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        int num, sum =0;
        double avg =0;
        for (int i = 0; i < count; i++) {
               num = sc.nextInt();
               sum = sum + num;
         }

         avg = sum/count;
         System.out.println(avg);
    }
}
