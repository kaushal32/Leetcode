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
        ListNode slow=head;
        ListNode fast=head;
        if(head==null)return null;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)break;
        }
        if(fast.next==null||fast.next.next==null)return null;
        ListNode temp=head;
        while(temp!=slow){
            slow=slow.next;
            temp=temp.next;
            if(temp==slow){
                return temp;
            }
            
        }
        
        return head;
    }
}