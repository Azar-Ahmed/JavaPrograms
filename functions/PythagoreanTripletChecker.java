package functions;

public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int max = a; 
        if(b >= max){
            max = b;
        }
        if(c >= max){
            max = c;
        }

        boolean flag;
        if(max == a){
            flag = ((b*b + c*c) == (a*a));
        }else if(max == b){
            flag = ((a * a + c*c) == (b*b));
        }else {
            flag = ((b * b + a*a) == (c*c));
        }
        System.out.println(flag);
    }
}
