import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Find the larest number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        String result = (num1 > num2) ? num1 + " is largest" : num2 + " is largest";

        System.out.println(result);
        // Closing the scanner
        scan.close();       
    }
}
