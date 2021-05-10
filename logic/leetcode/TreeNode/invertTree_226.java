package TreeNode;

import java.util.Stack;

/**
 * 翻转二叉树 - 226
 *
 * 转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class invertTree_226 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node.left != null){
                stack.add(node.left);
            }
            if (node.right != null){
                stack.add(node.right);
            }
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}
