/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // 使用递归的方法会超时
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        // if(n==2){
        //     return 2;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);

        if(n==0||n==1||n==2){return n;}
        int[] nums = new int[n];
        nums[0]=1;
        nums[1]=2;
        for(int i=2;i<n;i++){
            nums[i]=nums[i-1]+nums[i-2];
        }
        return nums[n-1];
    }
}
// @lc code=end

