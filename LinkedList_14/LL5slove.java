public class LL5slove {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode tem = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode nextN = cur.next;

            cur.next = tem;
            tem = cur;
            cur = nextN;

        }
        return tem;

    }
}