/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int pre =0;
        int max =nums[0];
        for(int x:nums){
            pre= Math.max(pre+x,x);
            max = Math.max(pre ,max);
        }
        return max;
    }
}
// @lc code=end

