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
         ListNode slow = head;
        ListNode fast = head;
        if(head == null ||head.next== null){
            return null;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                int length = 0;
                do{
                    slow = slow.next;
                    length++;
                }while(slow != fast);
                fast = head;
                slow = head;
                for(int i = 0; i < length; i++){
                    slow = slow.next;
                }
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
            
        }
        return null;
    }
}