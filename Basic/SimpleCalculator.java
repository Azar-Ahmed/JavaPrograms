import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number One");
        double numOne = scan.nextDouble();

        System.out.println("Enter Number Two");
        double numTwo = scan.nextDouble();

        System.out.println("Select any one Operator (+, -, *, /)");
        String operator = scan.next();
        double result = 0;

        switch (operator) { 
            case "+": 
                result = numOne + numTwo;
                break;

                case "-": 
                result = numOne - numTwo;
                break;

                case "*": 
                result = numOne * numTwo;
                break;

                case "/": 
                if(numTwo != 0){
                    result = numOne + numTwo;
                }else{
                    System.out.println("Error : Divison by zero is not allowed ");
                    System.exit(1);
                }
                break;
        
            default:
            System.out.println("Invalid Operator");
            System.exit(1);
                break;
        }
        System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);

             // Closing the scanner
         scan.close();

    }    
}
