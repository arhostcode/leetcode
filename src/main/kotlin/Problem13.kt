class Problem13 {

    class Solution {

        private fun Char.convertToRoman(): Int {
            return when (this) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }

        fun romanToInt(s: String): Int {
            var result = 0
            var prev = 0
            for (char in s) {
                val currentInt = char.convertToRoman()
                if (currentInt > prev) {
                    result -= prev * 2
                }
                result += currentInt
                prev = currentInt
            }
            return result
        }
    }

}

fun main() {
    println(Problem13.Solution().romanToInt("CVX"))
}