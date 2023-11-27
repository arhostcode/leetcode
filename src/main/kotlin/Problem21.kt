class Problem21 {
    class Solution {
        fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
            val head = ListNode(0)
            var last = head
            var list1Last = list1
            var list2Last = list2
            while (list1Last != null || list2Last != null) {
                if (list1Last == null) {
                    last.next = list2Last
                    last = last.next!!
                    list2Last = list2Last?.next
                } else if (list2Last == null) {
                    last.next = list1Last
                    last = last.next!!
                    list1Last = list1Last.next
                } else {
                    if (list1Last.`val` < list2Last.`val`) {
                        last.next = list1Last
                        last = last.next!!
                        list1Last = list1Last.next
                    } else {
                        last.next = list2Last
                        last = last.next!!
                        list2Last = list2Last.next
                    }
                }
            }
            return head.next
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

fun main() {
    val list = Problem21.ListNode(1)
    list.next = Problem21.ListNode(2)
    list.next = Problem21.ListNode(4)

    val list2 = Problem21.ListNode(1)
    list2.next = Problem21.ListNode(3)
    list2.next = Problem21.ListNode(4)
    Problem21.Solution().mergeTwoLists(list, list2)
}