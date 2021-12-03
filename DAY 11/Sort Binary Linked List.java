//  https://www.interviewbit.com/problems/sort-binary-linked-list/



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode newL = A;
        int zero = 0;
        int ones = 0;
        while(newL!= null){
            if(newL.val == 0){
                zero++;
            }
            else if (newL.val == 1){
                ones++;
            }
            newL = newL.next;
        }
        ListNode newM = A;
        while(zero>0){
            newM.val = 0;
            zero--;
            newM = newM.next;
        }
        while(ones>0){
            newM.val = 1;
            ones--;
            newM = newM.next;
        }
        return A;

    }
}
