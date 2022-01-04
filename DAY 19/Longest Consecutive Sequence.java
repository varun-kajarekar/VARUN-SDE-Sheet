/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Example: 

Given [100, 4, 200, 1, 3, 2],

The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        int[] arr = A;
        Arrays.sort(arr);
        int count =0;
        int max_count = -10000000;
        for(int i =0;i<A.length-1;i++){
            if(arr[i] == arr[i+1]-1){
                count++;
            }
            else if(arr[i] == arr[i+1]){
                continue;
            }
            else if(arr[i] != arr[i+1]-1){
                count =0;;
            }
            if(count>max_count){
                max_count = count;
            }
        }
        if(A.length==1){
            return 1;
        }
        return max_count+1;
    }
}
