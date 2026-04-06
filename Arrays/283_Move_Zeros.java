public class Solution {

    /**
     * Moves all zeroes in the array to the end while maintaining
     * the relative order of non-zero elements.
     *
     * This is done in-place using a two-pointer approach.
     *
     * @param nums the input array
     */
    public void moveZeroes(int[] nums) {

        int i = 0;

        // Traverse the array
        for (int j = 0; j <= nums.length - 1; j++) {

            if (nums[j] != 0) {

                // Swap non-zero element with position i
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
            }
        }
    }

    // Optional: main method for testing
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {0, 1, 0, 3, 12};

        solution.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}