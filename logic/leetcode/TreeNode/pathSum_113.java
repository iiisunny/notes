package TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 路径总和 II - 113
 *
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 *
 */

public class pathSum_113 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        recur(root,targetSum);
        return res;
    }

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public void recur(TreeNode root, int tar){
        if (root == null){
            return;
        }

        path.add(root.val);
        tar -= root.val;

        if (tar == 0 && root.left == null && root.right == null){
            res.add(new LinkedList<>(path));
        }
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }

}
