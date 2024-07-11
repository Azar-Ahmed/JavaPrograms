import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Find Simple Intrest");

        System.out.println("Enter Principal");
        double principal = sc.nextDouble();

        System.out.println("Enter Rate");
        double rate = sc.nextDouble();

        System.out.println("Enter Time");
        double time = sc.nextDouble();

        double result = (principal * rate * time) / 100; 

        System.out.println("Simple Intest = " + result);
        
        // Closing the scanner
        sc.close();

    }
}
