//https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] a) {
        int cur_sum = 0;
        int max_sum = a[0];
        for(int i =0;i<a.length;i++){
            cur_sum = cur_sum+a[i];
            if(cur_sum>max_sum){
                max_sum = cur_sum;
            }
            if(cur_sum<0){
                cur_sum = 0;
            }
        }
        return max_sum;
    }
}
