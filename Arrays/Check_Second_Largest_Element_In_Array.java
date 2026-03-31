public class Solution {

    /**
     * Finds the second largest element in the given array.
     *
     * @param nums the input array of integers
     * @return the second largest element, or -1 if it does not exist
     *         (e.g., all elements are same or array size < 2)
     */
    public int secondLargestElement(int[] nums) {

        int seclargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largest) {
                seclargest = largest;
                largest = nums[i];
            }
            else if (nums[i] < largest && nums[i] > seclargest) {
                seclargest = nums[i];
            }
        }

        // If second largest not found, return -1
        return (seclargest == Integer.MIN_VALUE) ? -1 : seclargest;
    }

    // Optional: main method for testing
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {10, 5, 20, 8, 20};

        int result = solution.secondLargestElement(nums);

        System.out.println("Second Largest Element: " + result);
    }
}