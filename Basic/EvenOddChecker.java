import java.util.Scanner;

public class EvenOddChecker {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to check wether the no is odd or even");
        int num = sc.nextInt();

        // if(num/2 == 0) {
        //     System.out.println("Number is Even");
        // }else{
        //     System.out.println("Number is Odd");
        // }

        String res = (num /2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(res);

        // Closing the scanner
        sc.close();
    }
}
