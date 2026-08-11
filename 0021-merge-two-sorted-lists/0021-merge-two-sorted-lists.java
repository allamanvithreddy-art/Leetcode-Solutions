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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode temp=list1;
    ListNode temp1=list2;
    ListNode head=null;
    ListNode tail=null;
    while(temp!=null && temp1!=null){
        if(temp.val<=temp1.val){
            ListNode newnode=new ListNode(temp.val);
            if(head==null){
            head=newnode;
            tail=newnode;
        }
        else if(head!=null){
            
             tail.next=newnode;
             tail=newnode;   
            
        }
            temp=temp.next;
        }
        else if(temp!=null && temp1!=null && temp.val>temp1.val){
            ListNode newnode=new ListNode(temp1.val);
            if(head==null){
            head=newnode;
            tail=newnode;
        }
        else if(head!=null){
            
             tail.next=newnode;
             tail=newnode;   
            
        }
            temp1=temp1.next;
        }
        
        }
        while(temp!=null){
            ListNode newnode=new ListNode(temp.val);
            if(head==null){
            head=newnode;
            tail=newnode;
        }
        else if(head!=null){
            
             tail.next=newnode;
             tail=newnode;   
            
        }
           
            temp=temp.next;
        }
        while(temp1!=null){
            ListNode newnode=new ListNode(temp1.val);
            if(head==null){
            head=newnode;
            tail=newnode;
        }
        else if(head!=null){
            
             tail.next=newnode;
             tail=newnode;   
            
        }
            temp1=temp1.next;
        }
    return head;
    }
}