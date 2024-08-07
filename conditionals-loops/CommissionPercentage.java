import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        double comm = 0.0, sale;
        int rate = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sales rs");
        sale = sc.nextDouble();
        if(sale <= 20000){
            rate = 3;
            comm = sale * 0.3;
        }else if(sale >=20000 && sale<=50000){
            rate = 12;
            comm = sale * 0.12;
        }else if(sale > 50000){
            rate = 31;
            comm = sale * 0.31;
        }

        System.out.println("Sales : 250" + sale);
        System.out.println("Rate of Intrest : " + rate);
        System.out.println("Commission : " + comm);

        sc.close();
    }
}
