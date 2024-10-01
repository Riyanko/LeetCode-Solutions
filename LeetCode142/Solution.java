package com.dsa.linkedlist.single.LeetCode.LeetCode142;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow =head;
        ListNode temp=head;
        if(head==null || head.next==null)
            return null;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow =slow.next;
            if(fast==slow){
                break;
            }
        }
        if(slow!=fast){
            return null;
        }
        while(temp!=slow && temp.next!=null){
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }
}
