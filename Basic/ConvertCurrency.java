import java.util.Scanner;

public class ConvertCurrency {
        public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter INR");
         double indRupee = scan.nextDouble();
         double USD = 0;

          USD = indRupee / 83.57;
            
          System.out.println("USD Amt is " + String.format("%.2f", USD));
           
         
        // Closing the scanner
        scan.close();
        }
}
