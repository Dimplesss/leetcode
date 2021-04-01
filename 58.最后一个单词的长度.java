/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {

        //先去除末尾的空格，再用方法lastIndexOf()
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;



        //转化成数组，要考虑字符串为" "和为""的情况
        if(s.length()<1){
            return 0;
        }
        String[] str =s.split(" ");
        if(str.length==0){
            return 0;
        }
        String ans = str[str.length-1];
        return ans.length();
    }
}
// @lc code=end

