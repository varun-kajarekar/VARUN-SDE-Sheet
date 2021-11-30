//https://www.interviewbit.com/problems/counting-subarrays/



public class Solution {
    public int solve(ArrayList<Integer> A, int B) {

        int i=0, j=0;
        int count=0;
        int currSum = 0;
        //for(int i=0; i< A.size();i++){

        while(i<A.size() || j< A.size()){
            //System.out.println(i + " "+ j);
            if(currSum < B && j < A.size())
            {
                count+= j-i;
                //currSum += A.get(j);
                //if(j< A.size())
                currSum +=A.get(j);
                j++;
            }
            else{
                if(currSum < B)
                    count++;
                currSum -= A.get(i);
                i++;
                

            }


        }  
        return count;
    }
}
