import java.util.Stack;

public class Test05 {
    /**
     * 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作
     * @param element 操作数
     * @param
     */

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();
    /**
     * 人队操作
     */
    public void enqueue(int element){
        stack1.push(element);
    }
    /**
     * 出队操作
     */
    public Integer dequeue(){
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public static void main(String[] args) {
        Test05 t1 = new Test05();
        t1.enqueue(1);
        t1.enqueue(2);
        t1.enqueue(3);
        t1.enqueue(4);
        System.out.println(t1.dequeue());
        System.out.println(t1.dequeue());
        t1.enqueue(5);
        System.out.println(t1.dequeue());
        System.out.println(t1.dequeue());
        System.out.println(t1.dequeue());

    }
}
