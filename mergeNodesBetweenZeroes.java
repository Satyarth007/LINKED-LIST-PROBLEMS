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
    public ListNode mergeNodes(ListNode head) {
        if(head.next.next == null){ // if there is no nodes other two zero nodes
			return null;
		}
		ListNode temp=head.next;
		while(temp != null){
			while(temp.next.val != 0){
				temp.val+=temp.next.val;
				temp.next=temp.next.next;
			}
			if(temp.next.val == 0){
				temp.next=temp.next.next;
				temp=temp.next;
			}
		}
		return head.next;
        
    }
}
