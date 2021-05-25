package ListNode;

import java.util.ArrayList;

/**
 * 回文链表 - 234
 * 请判断一个链表是否为回文链表
 *
 * 输入: 1->2
 * 输出: false
 *
 * 输入: 1->2->2->1
 * 输出: true
 *
 */
public class isPalindrome_234 {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        while (head != null){
            res.add(head.val);
            head = head.next;
        }

        for (int i = 0; i < res.size()/2; i++) {
            if (res.get(i) != res.get(res.size() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
