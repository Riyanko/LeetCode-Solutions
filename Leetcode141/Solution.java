package com.dsa.linkedlist.single.LeetCode.Leetcode141;


//Linked list Cycle detection
class ListNode {
    int val;
    ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){

                return true;

            }
        }
        return false;
    }
}