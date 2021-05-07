/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
           String s ="1";
           for(int i = 0;i<n-1;i++){
                s =describe(s);
           }
           return s;

    }
    public String describe(String s){
        StringBuffer sb = new StringBuffer();
        if(s.length() ==1){
            sb.append('1');
            sb.append(s);
        }
        int num =1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                num++;
                if(i == s.length()-1){
                    sb.append(num);
                    sb.append(s.charAt(i));
                }
            }else{
                sb.append(num);
                sb.append(s.charAt(i-1));
                num=1;
                if(i== s.length()-1){
                    sb.append("1");
                    sb.append(s.charAt(i));
                }
            }
            
        }
        return sb.toString();
    }
}
// @lc code=end

