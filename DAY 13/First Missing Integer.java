

public class Solution {
    public int firstMissingPositive(int[] A) 
    {
       Arrays.sort(A);
       int out=1;
       for(int i=0;i<A.length;i++)
       {
           if(0<A[i])
           {
              if(out==A[i])
              out++;
              else
              return out;
           }
       }
       return out;
    }
