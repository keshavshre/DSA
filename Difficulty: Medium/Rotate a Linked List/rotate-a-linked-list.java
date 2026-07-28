/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        Node tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(k==len || k%len==0)return head;
        k=k%len;
        Node temp=head;
        int ind=1;
        while(ind!=k){
            temp=temp.next;
            ind++;
        }
        tail.next=head;
        Node newhead=temp.next;
        temp.next=null;
        return newhead;
    }
}