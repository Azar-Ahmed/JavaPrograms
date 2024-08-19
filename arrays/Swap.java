import java.util.Arrays;

public class Swap{
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        swap(nums, 1, 2);
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}