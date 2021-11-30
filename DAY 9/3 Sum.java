//https://www.interviewbit.com/problems/3-sum/



public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int diff = Integer.MAX_VALUE;
        int out = 0;
        for(int i =0;i<A.size()-2;++i){
            int l =  i+1;
            int r = A.size()-1;
            while(l<r){
                int sum = A.get(i)+A.get(l)+A.get(r);
                int diff2 = sum>B ? sum-B:B-sum;
                if(sum -B == 0){
                    return B;
                }
                else if (diff>diff2){
                    out = sum;
                    diff = diff2;
                }
                if(sum>B){
                    --r;
                }else{
                    ++l;
                }
            }
        }
        return out;
    }
}
