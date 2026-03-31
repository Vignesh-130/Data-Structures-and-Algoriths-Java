public class Solution {

    /**
     * Finds the largest element in the given array.
     *
     * @param nums the input array of integers
     * @return the largest element in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public int largestElement(int[] nums) {

        // Input validation
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Initialize max with first element (handles negative values)
        int max = nums[0];

        // Traverse the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = { -5, -2, -9, -1 };

        int result = solution.largestElement(nums);

        System.out.println("Largest element: " + result);
    }
}