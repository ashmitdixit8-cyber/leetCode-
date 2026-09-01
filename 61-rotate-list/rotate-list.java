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
        if(head==null) return null;
        int n=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            n++;
        }
        k=k%n;
        if(k==0) return head;
        int temp=n-k;
        int count=1;
        ListNode tempp=head;
        while(count!=temp){
            tempp=tempp.next;
            count++;
        }
        ListNode next=tempp.next;
        tempp.next=null;
        last.next=head;
        head=next;
        return head;
        
    }
}