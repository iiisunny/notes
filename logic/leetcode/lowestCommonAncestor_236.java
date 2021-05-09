/**
 * 二叉树的最近公共祖先 - 236
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
 *
 * 输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出：3
 * 解释：节点 5 和节点 1 的最近公共祖先是节点 3 。
 *
 *
 */
public class lowestCommonAncestor_236 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

            // 判断当前(树)节点是否为最近公共祖先
            if (root == null || p == root || q == root){
                return root;
            }
            // 在左子树中寻找最近公共节点
            TreeNode left = lowestCommonAncestor(root.left, p, q);

            //在右子树中寻找最近公共节点
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            //左右子树都找到了公共节点,只能是根节点(因为左右子树交集只有根节点)
            if (left != null && right != null){
                return root;
            }else if (left != null){ // 在左子树找到了公共节点,返回公共节点
                return left;
            }else if (right != null){ // 在右子树找到了公共节点,返回公共节点
                return right;
            }else {
                return null; // 左右两边都没找到公共节点,说明没有公共祖先
            }

        }



    }
}
