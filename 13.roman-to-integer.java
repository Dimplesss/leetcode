/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    //这是我第一时间想到的方法
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
    //网络提供答案
    public int romanToInt(String str) {
        int[] a = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;
        char prev = 'A';
        int sum = 0;
        for(char s : str.toCharArray()) {
            if(a[s - 'A'] > a[prev - 'A']) {
                sum = sum - 2 * a[prev - 'A'];
            }
            sum = sum + a[s - 'A'];
            prev = s;
        }
        return sum;
    }
}
// @lc code=end

