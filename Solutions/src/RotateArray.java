/**
 * created by James Vincent on 5/16/23
 **/
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;

        // Normalize k to be within the array length
        k = k % length;

        // Reverse the entire array
        reverse(nums, 0, length - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
