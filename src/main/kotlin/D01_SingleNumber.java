import java.util.Arrays;

/**
 * Given a **non-empty** array of integers, every element appears twice except for one. Find that single one.
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * ```
 * Input: [2,2,1]
 * Output: 1
 * ```
 *
 * Example 2:
 *
 * ```
 * Input: [4,1,2,1,2]
 * Output: 4
 * ```
 */
class D01_SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 && nums[i] != nums[i + 1]) {
                return nums[i];
            }
            if (i == nums.length - 2 && nums[i] != nums[i + 1]) {
                return nums[i + 1];
            }
            if (i > 0 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        throw new RuntimeException("No single digit found");
    }

    public static void main(String[] args) {
        System.out.println(new D01_SingleNumber().singleNumber(new int[]{3, 3, 4, 5, 7, 7, 4}));
    }
}
