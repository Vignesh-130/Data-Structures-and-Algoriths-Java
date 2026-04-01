public class Solution {

    /**
     * Removes duplicates from a sorted array in-place.
     *
     * This method modifies the input array such that the first k elements
     * contain the unique elements in sorted order.
     *
     * @param nums the sorted input array
     * @return the number of unique elements (k)
     */
    public int removeDuplicates(int[] nums) {

        int i = 0;

        // Traverse the array using second pointer
        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    // Optional: main method for testing
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}