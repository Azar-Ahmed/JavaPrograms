public class MaxVal {
    public static void main(String[] args) {
        int[] nums = {3, 4, 15, 5, 12};
       System.out.println(max(nums));
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
