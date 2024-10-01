package com.dsa.linkedlist.single.LeetCode.LeetCode61;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        int i=1,size=0;
        if(head==null || head.next==null){
            return head;
        }
        while(fast!=null){
            fast=fast.next;
            size++;
        }
        fast=head;
        k=k%size;
        while(i<=k){
            fast=fast.next;
            i++;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
        return head;
    }
}
