/**
 * 两个链表的第一个公共节点
 *
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 *
 *
 */
public class Test51 {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            this.val = x;
            this.next = null;
        }
    }

    /**
     * 头节点 headA 到 node 前，共有 a - c 个节点
     * 头节点 headB 到 node 前，共有 b - c 个节点
     * 指针 A 先遍历完链表 headA ，再开始遍历链表 headB ，当走到 node 时，共走步数为：a + (b - c)
     * 指针 B 先遍历完链表 headB ，再开始遍历链表 headA ，当走到 node 时，共走步数为：b + (a - c)
     * 此时指针 A , B 重合，并有两种情况：a + (b - c) = b + (a - c)
     * 若两链表 有 公共尾部 (即 c > 0 ) ：指针 A , B 同时指向「第一个公共节点」node 。
     * 若两链表 无 公共尾部 (即 c = 0 ) ：指针 A , B 同时指向 null
     *
     * 时间复杂度 O(a + b)
     * 空间复杂度 O(1)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }
}
