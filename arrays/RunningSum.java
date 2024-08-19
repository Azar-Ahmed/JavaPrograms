import java.util.Arrays;

public class RunningSum  {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ps[i] = ps[i -1] + nums[i];
        }
        System.out.println(Arrays.toString(ps));
    }
}
