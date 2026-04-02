public class Solution {

    /**
     * Rotates the array to the right by k steps.
     *
     * This method uses the reversal algorithm:
     * 1. Reverse the entire array
     * 2. Reverse first k elements
     * 3. Reverse remaining elements
     *
     * @param nums the input array
     * @param k number of steps to rotate
     */
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // Handle cases where k > n
        k %= n;

        // If no rotation needed
        if (k == 0) return;

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    /**
     * Helper method to reverse a portion of the array.
     *
     * @param nums the array
     * @param start starting index
     * @param end ending index
     */
    private void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    // Optional: main method for testing
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solution.rotate(nums, k);

        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}