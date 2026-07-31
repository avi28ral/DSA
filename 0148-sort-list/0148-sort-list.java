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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeLists(left, right);
        
    }
    private ListNode getMid(ListNode head){
        ListNode midPrev = null;
        
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
            
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    private ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode();
        ListNode tail = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            }else{
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            tail.next = l1;
            tail = tail.next;
            l1 = l1.next;
        }
        while(l2 != null){
            tail.next = l2;
            tail = tail.next;
            l2 = l2.next;
        }
        return head.next;
    }
}