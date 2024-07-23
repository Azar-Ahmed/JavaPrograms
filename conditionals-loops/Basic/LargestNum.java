import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int largest = Integer.MIN_VALUE;
        while (true) {
            n = sc.nextInt();
            if(n == 0) break;
            if(n>largest){
                largest = n;
            }
        }
        if (largest != Integer.MIN_VALUE) {
            System.out.println("Largest number entered: " + largest);
        } else {
            System.out.println("No valid numbers entered (excluding 0).");
        }
    }
}
