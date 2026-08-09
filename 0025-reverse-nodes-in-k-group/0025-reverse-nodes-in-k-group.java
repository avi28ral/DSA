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
    public ListNode reverseKGroup(ListNode head, int k) {
        if( k <= 1 || head == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null ){
            ListNode last = prev;
            ListNode newEnd = curr;
            ListNode temp = curr;
            for(int i = 0; temp != null && i < k-1; i++){
                temp = temp.next;
            }
            if(temp == null){
                break;
            }
            for(int i = 0; i < k; i++){

                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
              
            }
            
            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = curr;
            prev = newEnd;

        }
        return head;
    }
}