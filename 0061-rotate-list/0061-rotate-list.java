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
    public ListNode rotateRight(ListNode head, int k) {
        if(k <= 0 || head == null || head.next == null){
            return head;
        }
        ListNode end = head;
        int length = 1;
        while(end.next != null){
            length++;
            end = end.next;
        }
        end.next = head;
        
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newEnd = head;
        for(int i =0; i < skip-1; i++){
            newEnd = newEnd.next;
        }
        head = newEnd.next;
        newEnd.next = null;
        return head;
        
    }
}