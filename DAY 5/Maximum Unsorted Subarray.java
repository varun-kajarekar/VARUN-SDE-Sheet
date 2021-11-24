//https://www.interviewbit.com/problems/maximum-unsorted-subarray/

public class Solution {
    public int[] subUnsort(int[] arr) {
        int strt= -1 ,end= -1 ,i= 0 ,j= arr.length-1 ;
        int[] sor = new int[arr.length] ;
        for(int x=0 ;x<arr.length ;x++) {
            sor[x] = arr[x] ;
        }
        Arrays.sort(sor) ;
        while(i < arr.length) {
            if(arr[i] != sor[i]) {
                strt= i ;
                break ;
            }
            i++ ;
        }while(j > -1) {
            if(arr[j] != sor[j]) {
                end= j ;
                break ;
            }
            j-- ;
        }if(strt == -1  ||  end == -1) {
            int[] ans = new int[1] ;
            ans[0] = -1 ;
            return ans ;
        }else {
            int[] ans = new int[2] ;
            ans[0] = strt ;
            ans[1] = end ;
            return ans ;
        }
    }

}
