import java.util.*

class Problem26 {
    class Solution {
        fun removeDuplicates(nums: IntArray): Int {
            var emptyIndex = 1
            for (i in 1..<nums.size) {
                if (nums[i] != nums[i - 1]) {
                    nums[emptyIndex] = nums[i]
                    emptyIndex++
                }
            }
            return emptyIndex
        }
    }
}

fun main() {
    val array = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println(Problem26.Solution().removeDuplicates(array))
    println(array.contentToString())
}