import java.util.HashMap;

/**
 * 复杂链表的复制
 * 请实现 copyRandomList 函数，复制一个复杂链表。
 * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 *
 */
public class Test52 {
    public class Node{
        int val;
        Node next;
        Node random;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /**
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        Node cur = head;
        HashMap<Node,Node> hashMap = new HashMap<>();
        while (cur!=null){
            hashMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur!=null){
            hashMap.get(cur).next = hashMap.get(cur.next);
            hashMap.get(cur).random = hashMap.get(cur.random);
            cur = cur.next;
        }
        return hashMap.get(head);
    }
}
