// https://www.interviewbit.com/problems/kth-node-from-middle/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode a  = A;
        while(a!=null){
            arr.add(a.val);
            a = a.next;
        }
        int n = ((arr.size()/2)) - B;
        if(n<0){
            return -1;
        }
        return arr.get(n);
    }
}
