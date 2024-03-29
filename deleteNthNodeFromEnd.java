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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        if(size==n){
            head=head.next;
            return head;
        } 
        temp = head;
        size = size - n-1;
        
        
        while(temp!= null){
            if(size == 0){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            size--;
        }
        return head;
        
    }
}
