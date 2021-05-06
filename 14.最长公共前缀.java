/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //方法1
        if(strs.length == 0){
            return "";
        }
        String  result = "";
        for(int i = 0;i<strs[0].length();i++){
            String s = strs[0].substring(0,i+1);
            for(int j = 0;j<strs.length;j++){
                if(strs[j].indexOf(s) != 0){
                    break;
                }
                if(j == strs.length-1){
                    result = s;
                }
            }
        }
        return result;

        //方法2
        int max =0;
        if(strs.length == 0){
            return "";
        }
        String s0 = strs[0];
        for(int i=1 ;i<strs.length;i++){
            
        }



    }
}
// @lc code=end

