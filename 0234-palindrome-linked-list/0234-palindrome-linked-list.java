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
        Stack<Integer> k=new Stack<>();

        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
if(count==1){
    return true;
}
        temp=head;

        while(temp!=null){

           k.push(temp.val);
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            if(temp.val==k.peek()){
                k.pop();
            }
            temp=temp.next;
        }
        if(k.isEmpty()){
            return true;
        }
        
        return false;
    }
}