public class LL3solve {
    // User function template for JAVA

    /*
     * Node is defined as
     * 
     * class Node
     * {
     * int data;
     * Node next;
     * Node(int d) {data = d; next = null; }
     * }
     * 
     */
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;

    }
}