import java.util.ArrayList;
import java.util.LinkedList;
/**
 *  从上到下打印二叉树
 *  从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
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
 * [3,9,20,15,7]
 *
 *
 */
public class Test32 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
             this.val = x;
        }
    }

    public int[] levelOrder(TreeNode root) {
        if (root==null){
            return new int[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
        // 用list从因为如果用列表，队首出元素复杂度是 O(N) ，因此有性能损失
        LinkedList<TreeNode> treenode = new LinkedList<>();

        treenode.add(root);
        while (!treenode.isEmpty()){
            TreeNode node = treenode.poll();
            list.add(node.val);
            if (node.left!=null){
                treenode.add(node.left);
            }
            if (node.right!=null){
                treenode.add(node.right);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
