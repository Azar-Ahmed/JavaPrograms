package functions;

import java.util.Scanner;

public class VoteEligibilityChecker {
    public static void main(String[] args) {
        System.out.println("Enter Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        Checker(age);
    }

    static void Checker(int age){
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
