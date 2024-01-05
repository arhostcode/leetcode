class Problem27 {

    class Solution {
        fun removeElement(nums: IntArray, `val`: Int): Int {
            var currentIndex = 0
            for (i in nums.indices) {
                if (nums[i] != `val`) {
                    nums[currentIndex] = nums[i]
                    currentIndex++
                }
            }
            return currentIndex
        }
    }
}

fun main(args: Array<String>) {
    val solution = Problem27.Solution()
    val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val `val` = 2
    println(solution.removeElement(nums, `val`))
    println(nums.contentToString())
}