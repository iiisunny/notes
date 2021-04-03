import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *  从上到下打印二叉树
 *  从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
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
 *   [9,20],
 *   [15,7]
 * ]
 *
 *
 */
public class Test33 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if (root == null){
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            // 如果在for第二个条件的位置限定i<queue.size()的话，那么每进行一次循环都会重新取一次size而不是每一层取一次size
            for (int i = queue.size(); i > 0; i--) {
               TreeNode node = queue.poll();
               list.add(node.val);
               if (node.left!=null){
                   queue.add(node.left);
               }
               if (node.right!=null){
                   queue.add(node.right);
               }
            }
            result.add(list);
        }
        return result;
    }
}
