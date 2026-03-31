public class Solution {

    /**
     * Checks whether the given array is sorted and rotated.
     *
     * A sorted and rotated array will have at most one "drop"
     * where nums[i] > nums[i+1].
     *
     * @param nums the input array
     * @return true if the array is sorted and rotated, otherwise false
     */
    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Check for a drop (rotation point)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // Valid if at most one rotation point exists
        return count <= 1;
    }

    // Optional: main method for testing
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {3, 4, 5, 1, 2}; // true
        int[] nums2 = {2, 1, 3, 4};    // false

        System.out.println("Is sorted & rotated (nums1): " + solution.check(nums1));
        System.out.println("Is sorted & rotated (nums2): " + solution.check(nums2));
    }
}