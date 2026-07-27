/* Structure of a Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
       data = d;
       next = null;
    }
}*/
class Solution {
    public Node sortLL(Node head) {
        // code here
        if(head==null)return null;
        ArrayList<Integer>a=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            a.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(a);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.data=a.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}