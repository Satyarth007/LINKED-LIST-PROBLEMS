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
    // swap function to swap the node value
    public void swap(ListNode x, ListNode y){
        int temp=x.val;
        x.val=y.val;
        y.val=temp;
    }
    
    public ListNode swapPairs(ListNode head) {
    // first count the ttal no. of nodes
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
   // now swap the values only even times with adjacent nodes     
        ListNode t=head;
        for(int i=1;i<=count/2;i++){
            swap(t,t.next);
            t=t.next.next;
        
        }
        
        return head;
        
        
    }
}
