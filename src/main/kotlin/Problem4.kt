class Problem4 {

    class Solution {

        private fun IntArray.getOrInf(index: Int): Int {
            return if (index >= size) Int.MAX_VALUE else get(index)
        }

        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val newArray = arrayListOf<Int>()
            var iterFirst = 0
            var iterSecond = 0
            while (iterFirst < nums1.size || iterSecond < nums2.size) {
                val first = nums1.getOrInf(iterFirst)
                val second = nums2.getOrInf(iterSecond)
                println("$first $second")
                if (first < second) {
                    newArray.add(first)
                    iterFirst++
                } else {
                    newArray.add(second)
                    iterSecond++
                }
            }
            val size = newArray.size
            if (size % 2 == 0) {
                return (newArray[size / 2] + newArray[size / 2 - 1].toDouble()) / 2
            }
            return newArray[size / 2].toDouble()
        }
    }

}

fun main() {
    Problem4.Solution().findMedianSortedArrays(intArrayOf(1, 2, 7, 9), intArrayOf(2, 3, 4, 11))
}