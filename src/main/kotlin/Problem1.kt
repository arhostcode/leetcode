class Problem1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMapIndexWithValue = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (hashMapIndexWithValue.containsKey(target - nums[index])) {
                return intArrayOf(hashMapIndexWithValue[target - nums[index]]!!, index)
            } else {
                hashMapIndexWithValue[nums[index]] = index
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }
}

fun main() {
    val problem1 = Problem1()
    println(problem1.twoSum(intArrayOf(2, 7, 11, 15), 13).toList())
}