// https://www.interviewbit.com/problems/verify-prime/



public class Solution {
    public int isPrime(int A) {
        if(A<2 ){
            return 0;
        }
        for(int i =2;i<(double)Math.sqrt(A)+1;i++){
            if(A%i==0){
                return 0;
            }
        }
        return 1;
    }
}
