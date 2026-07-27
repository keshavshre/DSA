/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp=head1;
        HashSet<Node>h=new HashSet<>();
        while(temp!=null){
            h.add(temp);
            temp=temp.next;
        }
        temp=head2;
        while(temp!=null){
            if(h.contains(temp))return temp;
            temp=temp.next;
        }
        return null;
    }
}