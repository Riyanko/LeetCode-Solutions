package com.dsa.linkedlist.single.LeetCode.LeetCode234;

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
class Solution2{
    public ListNode reverse(ListNode head){
        if(head.next==null)
            return head;
        ListNode a=head.next;
        ListNode temp= reverse(a);
        a.next=head;
        head.next=null;
        return temp;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode rev=reverse(slow);
        ListNode temp=rev;
        while(head!=rev && temp!=null){
            if(head.val!=temp.val){
                return false;
            }
            head=head.next;
            temp=temp.next;
        }
        return true;
    }
}
