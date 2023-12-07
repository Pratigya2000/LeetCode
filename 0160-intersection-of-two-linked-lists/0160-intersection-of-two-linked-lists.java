/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        //Length of List A
        int lenA=0;
        ListNode tempA = headA;
        while(tempA != null){
            lenA++;
            tempA = tempA.next;
        }
        
        //Length of List B
        int lenB=0;
        ListNode tempB = headB;
        while(tempB != null){
            lenB++;
            tempB = tempB.next;
        }
        
        int diff = Math.abs(lenA-lenB);
        
        //Iterate on larger list for diff nodes
        tempA=headA;
        tempB=headB;
        
        if(lenA > lenB) {
            while(diff-- > 0)
                tempA = tempA.next;
        }
        else {
            while(diff-- > 0)
                tempB = tempB.next;
        }
        
        //Check for equailty
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
            if(tempA == null || tempB == null)
                return null;
        }
        
        return tempA;
    }
}