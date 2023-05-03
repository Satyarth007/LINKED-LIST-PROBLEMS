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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        // using two pointer 
        ListNode slow = head;
        ListNode fast = head;
        // prev node to store previous node of the mid 
       //  bcz after the while loop slow will become the mid element
       //  so  remove the mid element using the prev node
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast=fast.next.next;
         }
        prev.next = slow.next; // removing the mid element by making prev.next as mid.next 
        return head; 
        
    }
}
