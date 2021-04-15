public class Test14 {
    /**
     * 输入一个链表，输出该链表中倒数第k个结点
     *
     * 解题思路：
     * 设链表的长度为 N。设置两个指针 P1 和 P2，先让 P1 移动 K 个节点，则还有 N - K 个节点可以移动。
     * 此时让 P1 和 P2 同时移动，可以知道当 P1 移动到链表结尾时，P2 移动到第 N - K 个节点处，该位置就是倒数第 K 个节点。
     */
    public static class ListNode{
        int value;
        ListNode next;

    }

    /**
     * 快慢双指针
     * 先遍历统计链表长度，记为 n ；
     * 设置一个指针走 (n-k) 步，即可找到链表倒数第 k 个节点。
     *
     * 时间复杂度 O(N)
     * 空间复杂度 O(1)
     * @param head
     * @param k
     * @return
     */
    public static ListNode findKthToTail(ListNode head, int k) {

        // 输入的链表不能为空，并且k大于0
        if (k < 1 || head == null) {
            return null;
        }

        // 双指针指向头结点
        ListNode pointer = head;
        ListNode late = head;

        // 前指针向前走k步
        for (int i = 0; i < k; i++) {
            if (pointer != null){
                pointer = pointer.next;
            }else {
                return null;
            }
        }

        // 双指针共同移动
        while (pointer != null) {
            pointer = pointer.next;
            late = late.next;
        }

        return late;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.value = 1;

        head.next = new ListNode();
        head.next.value = 2;

        head.next.next = new ListNode();
        head.next.next.value = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new ListNode();
        head.next.next.next.next.value = 5;

        head.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.value = 6;

        head.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.value = 7;

        head.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.value = 8;

        head.next.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.next.value = 9;

//        System.out.println(findKthToTail(head, 1).value); // 倒数第一个
//        System.out.println(findKthToTail(head, 6).value); // 中间的一个
//        System.out.println(findKthToTail(head, 9).value); // 倒数最后一个就是顺数第一个

//        System.out.println(findKthToTail(head, 10));

        ListNode head1 = new ListNode();
        head1.value = 1;
        System.out.println(findKthToTail(head1, 1));
    }
}
