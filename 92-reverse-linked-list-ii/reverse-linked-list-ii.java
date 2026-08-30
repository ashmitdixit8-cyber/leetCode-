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
        ListNode before=null;
        int pos=1;
        ListNode temp=head;
        if(head==null) return null;
        if(left==right) return head;

        while(pos<left){
            before=temp;
            temp=temp.next;
            pos++;
        }
        int times=right-left+1;
        ListNode curr=temp;
        ListNode prev=null;
        while(times>0){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            times--;
        }
        
        temp.next=curr;
        if(before!=null){
            before.next=prev;
            return head;
        }
        return prev;
    }
}