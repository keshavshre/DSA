/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int zero=0;
        int one=0;
        int two=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0)zero++;
            else if(temp.data==1)one++;
            else two++;
            temp=temp.next;
        }
        temp=head;
        while(zero>0){
            temp.data=0;
            temp=temp.next;
            zero--;
        }
        while(one>0){
            temp.data=1;
            temp=temp.next;
            one--;
        }
        while(two>0){
            temp.data=2;
            temp=temp.next;
            two--;
        }
        return head;
    }
}