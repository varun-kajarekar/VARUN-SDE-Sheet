//https://www.interviewbit.com/problems/3-sum-zero

public class Solution {
    public int[][] threeSum(int[] A) {
        Arrays.sort(A);
        ArrayList<int[]> res = new ArrayList<>();
        for(int i=0;i<A.length-2;i++){
            if (i > 0 && A[i - 1] == A[i]) continue;
            int left =i+1;
            int right = A.length-1;
            while(left<right){
                long sum  = (long)A[i]+A[left]+A[right];
                if(sum==0){
                    res.add(new int[]{A[i],A[left],A[right]});
                    while (left < right && A[left] == A[left + 1]) left++;
                    while (left < right && A[right] == A[right - 1]) right--;
                }
                if(sum<0){
                    left++;
                }else right--;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
