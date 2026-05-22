package Arrays.basic;

public class MissingNumber {

    // Function to find the missing number
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        // Sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Actual sum of array elements
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = { 3, 0, 1 };
        System.out.println("Missing Number: " + missingNumber(nums1));

        // Example 2
        int[] nums2 = { 0, 1 };
        System.out.println("Missing Number: " + missingNumber(nums2));

        // Example 3
        int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("Missing Number: " + missingNumber(nums3));
    }
}