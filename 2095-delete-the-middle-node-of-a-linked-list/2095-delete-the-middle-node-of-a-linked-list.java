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
    public ListNode deleteMiddle(ListNode head) {
         int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int pos=count/2;
       
if(count==1){
    return null;
}
       
ListNode prev=head;
if(prev.next!=null){
    temp=prev.next;
}
        for(int i=1;i<pos;i++){
            prev=temp;
            temp=temp.next;
        }
        if(temp.next!=null)
        prev.next=temp.next;
        else{
            prev.next=null;
        }
        return head;
        
    }
}