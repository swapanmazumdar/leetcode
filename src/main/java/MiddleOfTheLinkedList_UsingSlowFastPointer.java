/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */
public class MiddleOfTheLinkedList_UsingSlowFastPointer {
    /**
     * Definition for singly-linked list.
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        int[] range = new int[]{1, 2, 3, 4, 5};
        ListNode head = createListNode(range);
        ListNode workerHead = new MiddleOfTheLinkedList().middleNode(head);
        while (workerHead != null) {
            System.out.println(workerHead.val);
            workerHead = workerHead.next;
        }

    }

    static ListNode createListNode(int[] range) {
        if (range.length == 0) {
            return null;
        }
        ListNode head = new ListNode(range[0]);
        ListNode workerHead = head;
        for (int i = 1; i < range.length; i++) {
            ListNode temp = new ListNode(range[i]);
            workerHead.next = temp;
            workerHead = workerHead.next;
        }
        workerHead = head;
        while (workerHead != null) {
            workerHead = workerHead.next;
        }
        return head;
    }
}