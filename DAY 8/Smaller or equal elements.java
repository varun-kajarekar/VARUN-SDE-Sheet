// https://www.interviewbit.com/problems/smaller-or-equal-elements/


public class Solution {
    public int solve(int[] A, int B) {
        int out = Binary_search(A,0,A.length,B);
        return out;
    }
    public int Binary_search(int [] a, int first,int last , int B){
        if(last <= first){
            return first;
        }
            int mid = first+(last-first)/2;
            if (a[mid]>B){
                return Binary_search(a,first,mid,B);
            }
            else{
                return Binary_search(a,mid+1,last,B);
            }
    }

}
