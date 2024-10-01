package com.dsa.linkedlist.single.LeetCode.LeetCode86;


 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode a=new ListNode(-1);;
        ListNode ta=a;
        ListNode b=new ListNode(-1);
        ListNode tb=b;
        while(temp!=null){
            if(temp.val<x){
                ta.next=temp;
                ta=ta.next;
                temp=temp.next;
            }else{
                tb.next=temp;
                tb=tb.next;
                temp=temp.next;
            }
        }
        tb.next=null;
        if(a.next==null) return b.next;
        a=a.next;
        b=b.next;

        ta.next=b;
        return a;


    }
}