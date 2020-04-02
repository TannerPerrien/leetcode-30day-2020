import java.util.*

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
class D01_SingleNumberK() {

    fun singleNumber(nums: IntArray): Int {
        Arrays.sort(nums)
        if (nums.size == 1) {
            return nums[0]
        }
        for (i in 0 until nums.size - 1) {
            if (i == 0 && nums[i] != nums[i + 1]) {
                return nums[i]
            }
            if (i == nums.size - 2 && nums[i] != nums[i + 1]) {
                return nums[i + 1]
            }
            if (i > 0 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i]
            }
        }
        throw RuntimeException("No single digit found")
    }
}

fun main() {
    print(D01_SingleNumberK().singleNumber(intArrayOf(3, 3, 4, 5, 7, 7, 4)))
}