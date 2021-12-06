// https://www.interviewbit.com/problems/single-number-ii/



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
    int a[] = A;
    Arrays.sort(a);
    
    int ret = a[a.length-1];
    
    for (int i = 0; i < a.length-1; i = i+3)
    {
            if (a[i] != a[i+1])
            {
                ret = a[i];
                break;
            }
            if (a[i+1] != a[i+2])
            {
                ret = a[i+1];
                break;
            }
    }
    
    return ret;
    }
}
