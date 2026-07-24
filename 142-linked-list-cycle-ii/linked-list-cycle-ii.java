/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        HashSet<ListNode>h=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(h.contains(temp))return temp;
            else{
                h.add(temp);
            }
            temp=temp.next;
        }
        return null;
    }
}