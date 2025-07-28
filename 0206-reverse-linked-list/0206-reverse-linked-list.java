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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode pres=head;
        if(head ==null){
            return head;
        }
        ListNode next=head.next;
        while(pres!=null && next!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            next=next.next;
        }
        pres.next=prev;
        prev=pres;
        return prev;
        
    }
}