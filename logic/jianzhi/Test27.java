/**
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 输入：A = [1,2,3], B = [3,1]
 * 输出：false
 *
 * 输入：A = [3,4,5,1,2], B = [4,1]
 * 输出：true
 */
public class Test27 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    /**
     * 时间复杂度 O(MN) ： 其中 M,N分别为树 A和 树 B 的节点数量；先序遍历树 A 占用 O(M) ，每次调用 search(A, B) 判断占用 O(N)。
     * 空间复杂度 O(M) ： 当树 A 和树 B 都退化为链表时，递归调用深度最大。当 M≤N 时，遍历树 A 与递归判断的总递归深度为 M ；当 M>N时，最差情况为遍历至树 A 叶子节点，此时总递归深度为 M。
     *
     * @param A
     * @param B
     * @return
     */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (search(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    boolean search(TreeNode A, TreeNode B) {
        if(B == null){
            return true;
        }
        if(A == null || A.val != B.val){
            return false;
        }
        return search(A.left, B.left) && search(A.right, B.right);
    }
}
