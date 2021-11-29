//https://www.interviewbit.com/problems/power-of-2/

import java.math.BigInteger;
public class Solution {
    public int power(String A) {
        if(A.equals("1")){
            return 0;
        }
        BigInteger b_current = new BigInteger(A);
        BigInteger b2 = new BigInteger("2");
        BigInteger b1 = new BigInteger("1");
        while(!b_current.equals(b1)){
            if((b_current.remainder(b2)).intValue()==0){
                b_current = b_current.divide(b2);
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
