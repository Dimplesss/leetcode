/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    //使用的是数值转字符串的方法
    public boolean isPalindrome(int x) {
        String s= String.valueOf(x);
        char[] c =s.toCharArray();
        int i =0;
        while(i<=(c.length/2)){
            if(c[i]==c[c.length-1-i]){
                i++;
            }else
                return false;
        }
        return true;
    }
    //使用循环取余获得翻转后的数值进行比较
    public boolean isPalindrome(int num){
        int orginal =x ;
        int reversed = 0;
        int tmp =0;
        while(x >=1){
            tmp = x % 10;
            reversed = reversed * 10 +tmp;
            x= x/10;
        }
        return orginal == reversed;
    }
    //官方做法 ，同样是进行翻转，但只翻转一半进行比较
    public boolean isPalindrome(int x){
    if(x<0 || (x!=0 && x%10==0))
    return false;
    int res = 0;
       while(x>res){
        res = res*10 + x%10;
        x = x/10;
       }
    return (x==res || x==res/10);
    }
}
// @lc code=end

