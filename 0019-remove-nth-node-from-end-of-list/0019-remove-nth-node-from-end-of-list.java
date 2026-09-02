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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp=head;
      if(head==null){
        return null;
      }
      else if(head.next==null && n==1){
        return null;
      }
      int count=0;
      while(temp!=null){
        count++;
        temp=temp.next;
      }
      if(count-n==0){
        head=head.next;
        return head;
      }
temp=head;
      for(int i=1;i<count-n;i++){
temp=temp.next;
      }  
      temp.next=temp.next.next;
      return head;
    }
}