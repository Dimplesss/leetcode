/*
 * @lc app=leetcode.cn id=344 lang=java
 *  2021/04/15
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        char tmp;
        for (int i= 0;i<s.length/2;i++){
            tmp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=tmp;
        }
    }
}
// @lc code=end

