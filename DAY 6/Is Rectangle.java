//https://www.interviewbit.com/problems/is-rectangle/

public class Solution {
    public int solve(int A, int B, int C, int D) {
        int coount = 2;
        int [] ar ={A,B,C,D};
        for(int i =0;i<4;i++){
            for(int j =i+1;j<4;j++ ){
                if(ar[i]==ar[j]){
                    coount--;
                     
                }

            }
        }
        if(coount==0){
            return 1;
        }
        return 0;
    }
}
