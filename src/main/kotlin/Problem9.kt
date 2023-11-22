class Problem9 {
    class Solution {
        fun isPalindrome(x: Int): Boolean {
            if (x < 0)
                return false
            var int = x
            var reversedInt = 0
            while (int != 0) {
                reversedInt = reversedInt * 10 + (int % 10)
                int /= 10
            }
            println(reversedInt)
            return reversedInt == x
        }
    }
}

fun main() {
    println(Problem9.Solution().isPalindrome(1213))
}