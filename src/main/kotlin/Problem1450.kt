class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0
        for (time in startTime.indices) {
            if (startTime[time] <= queryTime && queryTime <= endTime[time]) {
                count++
            }
        }
        return count
    }
}

fun main() {
    println(Solution().busyStudent(intArrayOf(1, 2, 3), intArrayOf(3, 2, 7), 4))
}