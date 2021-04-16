/**
 * 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 4
 */
public class Test59 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            this.val = x;
        }
    }

    /**
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     */

    int x, res;
    public int kthLargest(TreeNode root, int k) {
        x = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        dfs(treeNode.right);
        if (x-- == 1){
            res = treeNode.val;
        }
        dfs(treeNode.left);
    }

}
