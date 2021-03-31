/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //使用了两个指针变量
        ListNode n=new ListNode(-1);
        ListNode ans=n;
        while(l1!= null&&l2!=null){
            if(l1.val<=l2.val){
                n.next=l1;
                l1=l1.next;
            }else{
                n.next=l2;l2=l2.next;
            }
            n=n.next;
        }
        if(l1!=null){
            n.next=l1;
        }else
            n.next=l2;
        return ans.next;
    }
}
// @lc code=end

