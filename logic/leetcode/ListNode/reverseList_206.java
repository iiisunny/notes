package ListNode;

/**
 * 反转链表 - 206
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */

public class reverseList_206 {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode pre = null;
        ListNode next = null;
        while (head != null){

            next = head.next;

            head.next = pre;

            pre = head;

            head = next;
        }
        return pre;
    }

}
