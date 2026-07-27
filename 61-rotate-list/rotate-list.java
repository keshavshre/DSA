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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        if(k==0)return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k==len)return head;
        k=k%len;
        if(k==0)return head;
        ListNode temp=head;
        int ind=len-k;
        int i=1;
        while(i!=ind){
            temp=temp.next;
            i++;
        }
        ListNode newhead=temp.next;
        temp.next=null;
        tail.next=head;
        return newhead;
    }
}