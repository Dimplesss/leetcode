/*
 * @lc app=leetcode.cn id=7 lang=java
 *  2021-04-17 
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        //要注意不会超过边界值,使用long
        long r = 0;
		while(x != 0){
			r = r*10 + x%10;
			x /= 10;
		}
		if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
			return (int)r;
		else
			return 0;
    }
}
// @lc code=end

