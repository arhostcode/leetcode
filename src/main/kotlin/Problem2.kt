class Problem2 {
    class Solution {
        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
            var l1Wrap = l1
            var l2Wrap = l2
            var result: ListNode? = null
            var lastNode: ListNode? = null
            var nextAppend = 0
            while (l1Wrap != null || l2Wrap != null) {
                val current = (l1Wrap?.`val` ?: 0) + (l2Wrap?.`val` ?: 0) + nextAppend
                nextAppend = current / 10
                val nextNode = ListNode(current % 10)
                if (result == null) {
                    lastNode = nextNode
                    result = lastNode
                } else
                    lastNode!!.next = nextNode
                lastNode = nextNode
                l1Wrap = l1Wrap?.next
                l2Wrap = l2Wrap?.next
            }
            if (nextAppend != 0) {
                lastNode!!.next = ListNode(nextAppend)
            }
            return result
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        fun append(num: Int): ListNode {
            val newNode = ListNode(num)
            newNode.next = this
            return newNode
        }
    }

}

fun main() {
    var first = Problem2.ListNode(3)
    first = first.append(4)
    first = first.append(2)

    var second = Problem2.ListNode(4)
    second = second.append(6)
    second = second.append(5)

    val answer = Problem2.Solution().addTwoNumbers(first, second)
    println(answer)

}