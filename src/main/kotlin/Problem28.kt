class Problem28 {
    class Solution {
        fun strStr(haystack: String, needle: String): Int {
            if (needle.isEmpty()) {
                return 0
            }
            var found: Boolean
            for (i in 0..haystack.length - needle.length) {
                found = true
                for (j in needle.indices) {
                    if (haystack[i + j] != needle[j]) {
                        found = false
                        break
                    }
                }
                if (found) {
                    return i
                }
            }
            return -1
        }
    }
}

fun main(args: Array<String>) {
    val solution = Problem28.Solution()
    println(solution.strStr("sadbutsad", "sad"))
}