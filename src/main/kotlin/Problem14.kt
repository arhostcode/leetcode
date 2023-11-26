class Problem14 {
    class Solution {

        fun longestCommonPrefix(strs: Array<String>): String {
            var longestPrefix = strs[0]
            for (element in strs) {
                longestPrefix = longestPrefix.commonPrefixWith(element)
            }
            return longestPrefix
        }
    }
}