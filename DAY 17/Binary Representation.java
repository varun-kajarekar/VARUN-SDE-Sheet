//https://www.interviewbit.com/problems/binary-representation/


public class Solution {
    public String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        int out = 0;
        int i = 0;
        if(A==0){
            return "0";
        }else{
        while(A>0){
            out = A%2;
            String ou = Integer.toString(out);
            A/=2;
            sb.append(ou);
        }
        sb.reverse();
        }
        return sb.toString();
    }
}
