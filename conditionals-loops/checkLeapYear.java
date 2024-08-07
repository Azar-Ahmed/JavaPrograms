public class checkLeapYear {
    public static void main(String[] args) {
        int year = 2020;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(true);

                } else {
                    System.out.println(false);
                }
            } else {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
    }
}
