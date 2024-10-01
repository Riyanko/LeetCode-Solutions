package com.dsa.linkedlist.single.LeetCode.LeetCode19;

import com.dsa.linkedlist.single.Node;

public class Solution2Pointers {
    public Node removeNthFromEnd(Node head, int n) {

        Node fast=head;
        Node slow=head;
        int i=1;
        while(i<=n){
            fast=fast.next;
            i++;
        }
        if(fast==null) {
            head = head.next;
        }else{
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }
        return head;
    }
}
