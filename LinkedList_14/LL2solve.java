public class LL2solve {
    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        // Your code here
        Node cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        if (n > count) {
            return -1;
        } else {
            Node pre = new Node(0);
            pre.next = head;
            Node slow = pre, fast = pre;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            int val = slow.data;
            return val;
        }
    }
}