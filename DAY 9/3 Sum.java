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



//                                    OR 



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        Collections.sort(arr);
        
        int sum = 9;  //sum of three numbers in an array;
        
        
        int n = arr.size();
        int i = 1;
        int j = n-1;
        Boolean out = false;
        for(int k=0;k<n-1;k++){
            while(i<j){
                int allsum = arr.get(k)+arr.get(i)+arr.get(j);  
                if(allsum>sum){
                    j--;
                }
                if(allsum==sum){
                    out = true;
                    System.out.println(arr.get(k)+" "+arr.get(i)+" "+arr.get(j)+" = "+allsum);
                    break;
                }
                if(allsum<sum){
                    i++;
                }
            }
        }
        System.out.println(out);
	
	}
}
