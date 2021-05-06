/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();
        char[] c =s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='('||c[i]=='['||c[i]=='{'){
                s1.push(c[i]);
            }
            if(s1.empty()){
                return false;
            }
            if(c[i]==']'){
                if(s1.peek()=='['){
                    s1.pop();
                }else
                    return false;
            }
            if(c[i]==')'){
                if(s1.peek()=='('){
                    s1.pop();
                }else
                    return false;
            }
            if(c[i]=='}'){
                if(s1.peek()=='{'){
                    s1.pop();
                }else
                    return false;
            }
        }

        return s1.empty();
    }
}
// @lc code=end

