import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 *
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 */

public class SubsetsWithDup {
    private static List<List<Integer>> ans;
    private static List<Integer> path;

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        path = new ArrayList<>();
        // 首先排序，让相同的两个元素排到一起去，便于去重
        Arrays.sort(nums);
        // 开始回溯
        backtrace(nums, 0);
        return ans;
    }

    private static void backtrace(int[] nums, int start) {
        // 首先加入当前路径，第一次为[]
        ans.add(new ArrayList<>(path));
        // 从 start 开始遍历每一个元素，尝试加入路径中
        for (int i = start; i < nums.length; ++i) {
            // 确保每次递归出来都是从start开始
            // 如果当前元素和前一个元素相同，而且前一个元素没有被访问，说明前一个相同的元素在当前层已经被用过了
            // 去重
            if (i > start && nums[i - 1] == nums[i]) continue;
            path.add(nums[i]); // 放到路径中
            backtrace(nums, i + 1); // 向下一个递归
            // 每次path放进去后，都应该去除使得下一次正常for循环的遍历是干净的path
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List list = subsetsWithDup(arr);
        for (Object a : list){
            System.out.println(a.toString());
        }
    }

}
