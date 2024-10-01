package com.dsa.linkedlist.single.LeetCode.LeetCode206;

class ListNode {
      int val;
      ListNode next;
     // ListNode() {}
      ListNode(int val) { this.val = val; }
     // ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode a=new ListNode(-1);
        ListNode ta=a;
        ListNode temp=head;
        ListNode temp1;
        while(temp!=null){
            temp1=temp;
            temp=temp.next;
            temp1.next=ta;
            ta=temp1;
        }
        head.next=null;
        return ta;
    }
}
