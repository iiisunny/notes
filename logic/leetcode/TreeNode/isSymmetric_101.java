package TreeNode;

/**
 * 对称二叉树 - 101
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 */
public class isSymmetric_101 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }


    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);

    }

    public boolean recur(TreeNode L, TreeNode R){
        if (L == null && R == null){
            return true;
        }
        if (L == null || R == null || L.val != R.val){
            return false;
        }
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}
