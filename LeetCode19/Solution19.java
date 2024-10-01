package com.dsa.linkedlist.single.LeetCode.LeetCode19;

import com.dsa.linkedlist.single.Node;

public class Solution19 {
    public void removeFromEnd(Node head,int n){
        Node temp=head;
        int size=0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        if((size-n)>0){
            for(int i=0;i<(size-n-1);i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }else if(size==1){
            head=null;
        }
        else{
            head= temp.next;
            }
        }


}
