/**
 * 把数组排成最小的数
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 输入: [10,2]
 * 输出: "102"
 *
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 */
public class Test42 {
    /**
     * 设数组 numsnums 中任意两数字的字符串为 xx 和 yy ，则规定 排序判断规则 为：
     *
     * 若拼接字符串 x + y > y + x ，则 x “大于” y ；
     * 反之，若 x + y < y + x ，则 x “小于” y ；
     *
     * @param nums
     * @return
     */
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }

        quickSort(strs, 0, strs.length - 1);
        // Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x))
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s);
        }

        return res.toString();
    }
    void quickSort(String[] strs, int l, int r) {
        if(l >= r) {
            return;
        }
        int i = l, j = r;
        String tmp = strs[i];
        while(i < j) {
            while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j){
                j--;
            }
            while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j){
                i++;
            }
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        strs[i] = strs[l];
        strs[l] = tmp;
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }
}
