package com.dsa.linkedlist.single.LeetCode.LeetCode876;

import com.dsa.linkedlist.single.Implementation;
import com.dsa.linkedlist.single.Node;

public class Solution876 {
    //delete a node from the middle of linked list
    public void DeleteMiddleNode(Node head){
        int size=0;
        Node temp=head;

        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        for(int i=1;i<size/2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}
