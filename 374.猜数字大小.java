/*
 * @lc app=leetcode.cn id=374 lang=java
 * 2021-04-15
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int min =1;
        int max = n;
        while(min<=max){
            int ans;
            ans = min+(max-min)/2;
            if(guess(ans)==-1){
                max=ans-1;
            }else if(guess(ans)==1){
                min =ans+1;
            }else  
                return ans;
        }
        return 0;
    }
}
// @lc code=end

