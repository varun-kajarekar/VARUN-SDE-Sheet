/**
Problem Description

Given a binary search tree A, where each node contains a positive integer, and an integer B, you have to find whether or not there exist two different nodes X and Y such that X.value + Y.value = B.

Return 1 to denote that two such nodes exist. Return 0, otherwise.



Problem Constraints
1 <= size of tree <= 100000

1 <= B <= 109



Input Format
First argument is the head of the tree A.

Second argument is the integer B.



Output Format
Return 1 if such a pair can be found, 0 otherwise.



Example Input
Input 1:

         10
         / \
        9   20


B = 19

Input 2:

 
          10
         / \
        9   20


B = 40



Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 10 + 9 = 19. Hence 1 is returned.
Explanation 2:

 No such pair exists.
 */
 
 
 
 
 
public class Solution {
    ArrayList<Integer> ans;
    public int t2Sum(TreeNode A, int B) {
        int out = kthsmallest(A,B);
        return out;
    }

    public int kthsmallest(TreeNode A, int B) {
        ans = new ArrayList<>();
        trav(A);
        int i =0,j=ans.size()-1;
        while(j>i){
            if(ans.get(i)+ans.get(j)>B){
                j--;
            }
            else if(ans.get(i)+ans.get(j)<B){
                i++;
            }
            else if(ans.get(i)+ans.get(j)==B){
                return 1;
            }
        }
        return 0;
    }
    public void trav(TreeNode root){
        if(root==null)return;
        trav(root.left);
        ans.add(root.val);
        trav(root.right);
    }
}
