// https://www.interviewbit.com/problems/insertion-sort-list/



public class Solution {
    public ListNode insertionSortList(ListNode A) {
        if(A==null||A.next==null) {
          return A;
        }
        ListNode insert;
        current=A.next;
        while(current!=null){
            insert=A;
            while(insert!=current){
                if(insert.val<current.val) insert=insert.next;
                else{
                    int temp=current.val;
                    current.val=insert.val;
                    insert.val=temp;
                }
            }
            current=current.next;
        }
        return A;
   }
}
