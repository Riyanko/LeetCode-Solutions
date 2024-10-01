package com.dsa.linkedlist.single.LeetCode.LeetCode234;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode a=new ListNode(-1);
        ListNode temp1 =a;
        ListNode temp=head;
        while(temp!=null){
            ListNode newnode=new ListNode(temp.val);
            newnode.next=temp1;
            temp1=newnode;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null&&temp1.next!=null){
            if(temp.val!=temp1.val){
                return false;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        return true;

    }
}
