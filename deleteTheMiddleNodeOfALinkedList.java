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
        ListNode temp1 = head;
        int count = 0;
        while(temp1!=null){
            count++;
            temp1 = temp1.next;
        }
        int n = count/2;
        ListNode temp2 = head;
        for(int i = 1 ; i<n;i++) temp2=temp2.next;
        temp2.next=temp2.next.next;
        return head;
        
    }
}
