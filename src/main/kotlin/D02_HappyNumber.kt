import java.util.*

/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * ```
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * ```
 */
class D02_HappyNumberK {

    fun isHappy(n: Int): Boolean {
        var n = n
        val visited = HashSet<Int>()

        while (true) {
            if (visited.contains(n)) {
                return false
            }
            visited.add(n)
            var temp = n
            var next = 0
            while (temp > 0) {
                val digit = temp % 10
                next += digit * digit
                temp /= 10
            }
            if (next == 1) {
                return true
            }
            n = next
        }
    }
}

fun main() {
    println(D02_HappyNumberK().isHappy(19))
}
