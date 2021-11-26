//https://www.interviewbit.com/problems/prime-sum/

public class Solution {
    public ArrayList<Integer> primesum(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        double sqrt = Math.sqrt(n);
        for (int i = 2; i < n; i ++) {
            if (isPrime(i) && isPrime(n - i)) {
                result.add(i);
                result.add(n-i);
                return result;
            }
        }
        return result;
    }
    
    private boolean isPrime(int a) {
        if (a == 1) { return false; }

        for (int i = 2; i <= Math.pow(a, 0.5); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
