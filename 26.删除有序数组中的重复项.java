/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int i=0;
        while(j<nums.length&&i<nums.length){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
                j++;
        }
        return i+1;
        
    }
}
// @lc code=end

