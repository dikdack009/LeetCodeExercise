class Solution2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var n1 = l1
        var n2 = l2
        var firstNode: ListNode? = null

        var prev: ListNode? = null

        var co = 0
        while (n1 != null || n2 != null) {
            val van1 = n1?.`val` ?: 0
            val van2 = n2?.`val` ?: 0

            var item = van1 + van2 + co
            if (item >= 10) {
                item %= 10
                co = 1
            } else {
                co = 0
            }
            if (firstNode == null) {
                firstNode = ListNode(item)
                prev = firstNode
            } else {
                val newNode = ListNode(item)
                prev!!.next = newNode
                prev = newNode
            }

            n1 = n1?.next
            n2 = n2?.next
        }
        if (co == 1) {
            prev!!.next = ListNode(1)
        }
        return firstNode
    }
}