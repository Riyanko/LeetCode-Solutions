package com.dsa.linkedlist.single.LeetCode.LeetCode160;


 //intersection of two linked ist
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
}

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        ListNode inter=null;
        int size1=0,size2=0,diff;
        while(temp1!=null){
            temp1=temp1.next;
            size1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            size2++;
        }
        temp1=headA;
        temp2=headB;
        if(size1 > size2){
            diff= size1-size2;
            int i=1;
            while(i<=diff){
                temp1=temp1.next;
                i++;
            }
        }else{
            diff=size2-size1;
            int i=1;
            while(i<=diff){
                temp2=temp2.next;
                i++;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
