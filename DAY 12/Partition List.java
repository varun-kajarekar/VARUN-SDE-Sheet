// https://www.interviewbit.com/problems/partition-list/



public class Solution {
public ListNode partition(ListNode A, int B) {

        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);

        ListNode tempLess = less, tempMore = more;

        while (A != null) {
            if (A.val >= B) {
                tempMore.next = A;
                A = A.next;
                tempMore = tempMore.next;
                tempMore.next = null;

            } else {
                tempLess.next = A;
                A = A.next;
                tempLess = tempLess.next;
                tempLess.next = null;
            }

        }

        tempLess.next = more.next;

        return less.next;

    }
}
