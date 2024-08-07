public class JavaPow {
    public static void main(String[] args) {
        int base = 3, exponent = 4, result =1;

        for (int i = 1; i <= exponent; i++) {
             result = result * base;
        }

        System.out.println(Math.pow(base, exponent)); // Inbuid Function
        System.out.println(result);
    }
}
