/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        HashSet<ListNode>h=new HashSet<>();
        while(temp!=null){
            h.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(h.contains(temp))return temp;
            temp=temp.next;
        }
        return null;
    }
}