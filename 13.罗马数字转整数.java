/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int ans= 0;
        char[] c =s.toCharArray();
        int i=0;
        while(i<c.length){
           if(c[i]=='I'){
                ans++;  
              if(i+1<c.length){
                  if(c[i+1]=='V'){
                      ans+=3;
                      i+=2;
                     continue;
                  }else if(c[i+1]=='X'){
                      ans+=8;
                      i+=2;
                      continue;
                  }
                      
              }  
            }
            if(c[i]=='X'){
                  ans+=10;
                if(i+1<c.length){
                  if(c[i+1]=='L'){
                      ans+=30;
                      i+=2;
                      continue;
                  }else if(c[i+1]=='C'){
                      ans+=80;
                      i+=2;
                      continue;
                  }
                    
              }  
                
            }
            if(c[i]=='C'){
                  ans+=100;
                if(i+1<c.length){
                  if(c[i+1]=='D'){
                      ans+=300;
                      i+=2;
                      continue;
                  }else if(c[i+1]=='M'){
                      ans+=800;
                     i+=2;
                      continue;
                  }
                    
              }
                
            }
            if(c[i]=='V'){
                ans+=5;
            }
            if(c[i]=='L'){
                ans+=50;
            }
            if(c[i]=='D'){
                ans+=500;
            }
            if(c[i]=='M'){
                ans+=1000;
            } 
            i++;
        }
       
        return ans;
    }
}
// @lc code=end

