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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode prev = null;
        int i=0;
        while(i!=a){
            i++;
            prev = temp1;
            temp1= temp1.next;
        }
        ListNode succ= temp1;
        int j = 0;
        while(j != (b-a)+1){
            j++;
            succ = temp1.next;
            temp1 = temp1.next;
        }

        prev.next= list2;
        ListNode temp2 = list2;
        while(temp2.next!=null) temp2=temp2.next;
        temp2.next = succ;

        return list1;

        
    }
}
