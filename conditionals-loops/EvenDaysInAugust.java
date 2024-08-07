public class EvenDaysInAugust {
    public static void main(String[] args) {
        int aug = 31;

        for (int i = 1; i <= aug; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
