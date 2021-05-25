package ListNode;

/**
 * 相交链表 - 160
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class getIntersectionNode_160 {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    /**
     * 头节点 headA 到 node 前，共有 a - c 个节点；
     * 头节点 headB 到 node 前，共有 b - c 个节点；
     *
     * a+(b−c)=b+(a−c)
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while (A != B){
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return B;
    }
}
