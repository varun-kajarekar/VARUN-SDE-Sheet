//https://www.interviewbit.com/problems/find-permutation/

public class Solution {
    public ArrayList<Integer> findPerm(final String A, int B) {
        
        int smallest =1;
        int largest = B;
        ArrayList<Integer> op = new ArrayList<Integer>();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='D')
            {
                op.add(largest);
                largest = largest -1;
            }
            else
            {
                op.add(smallest);
                smallest = smallest+1;
            }
        }
        
        op.add(smallest);
        return op;
    }
}
