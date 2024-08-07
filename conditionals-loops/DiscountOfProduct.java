import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double paybleAmt = 0; 
        double discountAmt = 0; 

        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("Enter Amount");
        double amt = sc.nextDouble();

        if(amt <= 10000){
            discountAmt = (amt*10)/100;
            paybleAmt = amt - discountAmt;
        }else if(amt > 10000 && amt <=25000){
            discountAmt = (amt*15)/100;
            paybleAmt = amt - discountAmt;
        }else if(amt > 25000){
            discountAmt = (amt*20)/100;
            paybleAmt = amt - discountAmt;
        }   
        
        System.out.println("Name\t amt\t discount\t payable amt");
        System.out.println("--------------------------------------");
        System.out.println(name + "\t" + amt + "\t" + discountAmt + "\t" + paybleAmt);
        System.out.println("--------------------------------------");

        
        // Scanner Close
        sc.close();
    }
}
