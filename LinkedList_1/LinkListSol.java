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
public class LinkListSol {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int count = 0;
        if (head == null) {
            return head;
        }
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        if (count == n) {
            return head.next;
        }
        int i = count - n;
        int s = 1;
        ListNode pre = head;
        while (s <= i) {
            if (i == s) {
                pre.next = pre.next.next;
            }
            pre = pre.next;
            s++;
        }
        return head;
    }
}