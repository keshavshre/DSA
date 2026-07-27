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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
        ListNode prev=null;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n)return head.next;
        temp=head;
        int ind=1;
        while(temp!=null){
            if(ind==(count-n+1)){
                prev.next=temp.next;
                break;
            }
            ind++;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}