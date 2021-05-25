import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 加试题：
 给定一个字符串s和一组单词dict，在s中添加空格将s变成一个句子，使得句子中的每一个单词都是dict中的单词
 返回所有可能的结果
 例如：给定的字符串s ="c2mcoderisbest",
 dict = ["c2m", "c2mcoder","coder","is","best"]
 返回的结果为["c2m coder is best", "c2mcoder is best"]
 **/

public class test1111 {
    public static ArrayList<String> StringAndDict(String s, Set<String> dict) {
        ArrayList<String> arrayList = new ArrayList();

        // 特殊情况
        if(s==null || s.length()==0){
            return arrayList;
        }

        findElement(s,dict,0,"",arrayList);
        return arrayList;
    }

    /**
     *
     * @param s 给定字符串
     * @param dict 给定字典
     * @param start 起始遍历的元素
     * @param element 符合的字符串
     * @param result 返回结果
     */
    public static void findElement(String s, Set<String> dict, int start, String element, ArrayList<String> result) {

        // 递归终止条件，当起始元素已经>=字符串长度,说明已经找到
        if(start >= s.length()) {
            result.add(element);
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = start;i < s.length();i++) {

            // 保存遍历当单词，当单词符合给定自定的元素时
            stringBuilder.append(s.charAt(i));

            // 判断当前字符串是dict中的元素，就添加" "然后继续向下寻找
            if(dict.contains(stringBuilder.toString())){

                String newElement = "";

                // 加空格
                if (element.length() > 0){
                    newElement = element+" "+stringBuilder.toString();
                }else { // 起始元素不需要加" "
                    newElement = stringBuilder.toString();
                }

                // 递归继续寻找
                findElement(s,dict,i+1, newElement, result);
            }
        }
    }

    public static void main(String[] args) {
        String s = "c2mcoderisbest";
        Set<String> dict = new HashSet<>();
        dict.add("c2m");
        dict.add("c2mcoder");
        dict.add("coder");
        dict.add("is");
        dict.add("best");
        ArrayList<String> list = StringAndDict(s,dict);
        int a = 2;

        String aa = "avc";
        System.out.println(aa.charAt(2));


    }
}
