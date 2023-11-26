import java.util.*

class Problem20 {
    class Solution {

        fun isValid(s: String): Boolean {
            val stack = Stack<Char>()
            s.forEach {
                when (it) {
                    '(', '[', '{' -> stack.push(it)
                    ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
                    '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
                    ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
                }
            }
            return stack.isEmpty()
        }
    }
}