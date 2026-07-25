/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return length(slow,fast);
        }
        return 0;
    }
    private int length(Node slow,Node fast){
        int count=1;
        slow=slow.next;
        while(slow!=fast){
            count++;
            slow=slow.next;
        }
        return count;
    }
}