package TreeNode;

import java.util.Arrays;

/**
 * 从前序与中序遍历序列构造二叉树 - 105
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 */
public class buildTree_105 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0){
            return null;
        }

        int root = preorder[0];

        // 一个节点时return
        if (preorder.length == 1){
            return new TreeNode(root);
        }

        // 寻找中序的root节点
        int indexRoot = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root){
                indexRoot = i;
                break;
            }
        }
        TreeNode treeNode = new TreeNode(root);
        treeNode.left = buildTree(Arrays.copyOfRange(preorder,1, indexRoot + 1), Arrays.copyOfRange(inorder,0, indexRoot));
        treeNode.right = buildTree(Arrays.copyOfRange(preorder, indexRoot + 1, preorder.length), Arrays.copyOfRange(inorder, indexRoot + 1, inorder.length));
        return treeNode;

    }
}
