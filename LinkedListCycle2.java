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
        HashSet<ListNode> hs=new HashSet<>();
        while(head!=null){
            if(hs.contains(head)) return head;
            else hs.add(head);
            head=head.next;
        }

        return null;
        
    }
}


                                                                // another solution 



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
    public ListNode cyclePoint(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return slow;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode cyc=cyclePoint(head);
        if(cyc==null) return null;
        ListNode p1=head;
        ListNode p2=cyc;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;

        
    }
}
