package TreeNode;

/**
 * 平衡二叉树 - 110
 *
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *
 *
 */
public class isBalanced_110 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return count(root) != -1;
    }

    public int count(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = count(root.left);
        if (left == -1){
            return -1;
        }
        int right = count(root.right);
        if (right == -1){
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
