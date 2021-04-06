/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int j =nums.length;
        while(i<j){
            if(nums[i]==val){
                nums[i]=nums[j-1];
                //在遇到需要删除的数后就用数组末尾的数值进行替换，这样将我们找到合适的j值的过程结合到其中，一直到找到合适的j值后，才会增加i值
                j--;
            }else
                i++;
        }

       return j;
    }
}
// @lc code=end

