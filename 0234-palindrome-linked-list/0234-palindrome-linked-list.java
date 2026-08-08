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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode EndOfFirst = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            EndOfFirst = slow;
            slow = slow.next;
        }
        EndOfFirst.next = null;
        
        ListNode prev = null;
        while(slow != null){
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        ListNode mid = prev;
        
        while(head != null){
            if(head.val != mid.val){
                return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;

    }
}