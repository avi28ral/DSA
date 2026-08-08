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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        for(int i = 1;curr != null && i < left; i++){
         prev = curr;
         curr = curr.next;
        }
        ListNode prevOfLeft = prev;
        ListNode LeftNode = curr;
        
        for(int i = 0; curr != null && i < right - left + 1; i++){
            ListNode NextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = NextNode;

        }
        if(prevOfLeft == null){
            head = prev;
        }else{
           prevOfLeft.next = prev;
        }
        LeftNode.next = curr;
        return head;
    }
}