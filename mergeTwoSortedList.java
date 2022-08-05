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
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;             //if l1 is empty then only l2 is left
        if(l2==null) return l1;              //if l2 is empty then only l1 is left
      
      
        if(l1.val< l2.val){                // if l1's first value is smaller than the first val of l2 then from second element of l1 should be merged
            l1.next=merge(l1.next,l2);
            return l1;
        }else{
            l2.next=merge(l1,l2.next);
            return l2;
        }
    
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      return merge(list1 , list2);  // USING RECURSION TO SOLVE THIS 
        
    }
}
