//https://www.interviewbit.com/problems/segregate-0s-and-1s-in-an-array/


public class Solution {
    public int[] solve(int[] A) {
        int start = 0; int end = A.length-1;
        int mid = 0;
        while(mid <end){
            if(A[mid]==0){
                int temp = A[mid];
                A[mid] = A[start];
                A[start] = temp ;
                start++;
                mid++;
            }
            if(A[mid]==1){
                int temp = A[mid];
                A[mid] = A[end];
                A[end] = temp ;
                end--;
            }
        }
        return A;
    }
}


//or simply sort the array.
