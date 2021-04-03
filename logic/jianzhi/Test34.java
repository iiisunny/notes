import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *  从上到下打印二叉树
 *  请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 *  例如:
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 *
 */

public class Test34 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            this.val = x;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return result;
        }
        queue.add(root);

        while (!queue.isEmpty()){
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(result.size() % 2 == 0) {
                    linkedList.addLast(node.val); // 偶数层 -> 队列头部
                }else {
                    linkedList.addFirst(node.val); // 奇数层 -> 队列尾部
                }
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            result.add(linkedList);
        }
        return result;
    }
}
