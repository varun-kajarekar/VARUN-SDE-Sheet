//https://www.interviewbit.com/problems/longest-subarray-length/



public class Solution {
    public int solve(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int len = 0;
        
        for(int i=0;i<A.length;i++)
        {
            sum += A[i] == 0 ? -1 : 1;
            
            if(sum == 1)
            {
                len = i+1;
            }
            else if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            
            if(map.containsKey(sum-1))
            {
                if(len < i - map.get(sum - 1))
                {
                    len = i - map.get(sum - 1);
                }
            }
        }
        
        return len;
    }
}
