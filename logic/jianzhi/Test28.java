import java.util.Stack;

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 *
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 */
public class Test28 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    /**
     * 递归：根据二叉树镜像的定义，考虑递归遍历（dfs）二叉树，交换每个节点的左 / 右子节点，即可生成二叉树的镜像。
     *
     * 时间复杂度 O(N) ： 其中 N 为二叉树的节点数量，建立二叉树镜像需要遍历树的所有节点，占用 O(N) 时间。
     * 空间复杂度 O(N) ： 最差情况下（当二叉树退化为链表），递归时系统需使用 O(N) 大小的栈空间。
     *
     *
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        // 在递归右子节点 “root.left = mirrorTree(root.right);root.left=mirrorTree(root.right);”
        // 执行完毕后， root.leftroot.left 的值已经发生改变，此时递归左子节点 mirrorTree(root.left)mirrorTree(root.left) 则会出问题

        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }

    /**
     * 利用栈（或队列）遍历树的所有节点 nodenode ，并交换每个 nodenode 的左 / 右子节点
     *
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     *
     * @param root
     * @return
     */

    public TreeNode mirrorTree1(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left != null) {
                stack.add(node.left);
            }
            if(node.right != null) {
                stack.add(node.right);
            }
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }

}
