public class FibonacciSerial {
    public static void main(String[] args) {
        int n = 10, a =1, b=1, temp;
       System.out.println(a);
       System.out.println(b);

       for (int i = 3; i < n; i++) {
            temp = a + b;
            System.out.println(temp);
            a = b;
            b = temp;
       }
    }
}
