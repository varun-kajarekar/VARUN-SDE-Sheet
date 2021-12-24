//https://www.interviewbit.com/problems/prime-numbers/


public class Solution {
    public int[] sieve(int A) {
        int[] X = new int[A+1];
        for(int i=0;i<=A;i++){
            X[i] = 1;
        }
        X[0] = 0;
        X[1] = 1;
        int count = 0;
        for(int i=2;i*i<=A;i++){
            if(X[i]==1){
                
                for(int j=2;i*j<=A;j++){
                    X[i*j] = 0;
                }
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=2;i<=A;i++){
            if(X[i]==1)a.add(i);
        }
        int[] ans = new int[a.size()];
        for(int i=0;i<a.size();i++){
            ans[i] = a.get(i);
        }
        
        return ans; 
    }
}
