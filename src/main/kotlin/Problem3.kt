import kotlin.math.max

class Problem3 {

    class Solution {
        fun lengthOfLongestSubstring(s: String): Int {
            val symbolsSet = HashMap<Char, Int>()
            var maxLength = 0
            var lastIndex = 0
            for (symbol in s.indices) {
                symbolsSet.compute(s[symbol]) { _, value ->
                    if (value != null && value >= lastIndex) {
                        maxLength = max(maxLength, symbol - lastIndex)
                        lastIndex = value + 1
                    }
                    symbol
                }

            }
            return max(maxLength, s.length - lastIndex)
        }
    }

}

fun main() {
    println(Problem3.Solution().lengthOfLongestSubstring("abba"))
}