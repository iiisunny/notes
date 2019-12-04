package 剑指Offer;

import java.util.ArrayList;
import java.util.Stack;

public class Test03 {
    /**
     * 从尾到头打印链表
     * 使用栈
     */

    //创建链表
    public static class ListNode {
        int val; // 结点的值
        ListNode next; // 下一个结点
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {//输入个链表的头结点，从尾到头反过来打印出每个结点的值
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty())
            ret.add(stack.pop());//出栈即为逆序
        return ret;
    }


    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.val = 1;
        root.next = new ListNode();
        root.next.val = 2;
        root.next.next = new ListNode();
        root.next.next.val = 3;
        root.next.next.next = new ListNode();
        root.next.next.next.val = 7;
        root.next.next.next.next = new ListNode();
        root.next.next.next.next.val = 4;

        ArrayList arrayList = printListFromTailToHead(root);

        for(Object object: arrayList)
            System.out.println(object);
    }
}