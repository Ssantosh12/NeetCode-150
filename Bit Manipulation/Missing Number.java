class Solution {
    public int missingNumber(int[] nums) {
        // we can solve this by just the simple mathematics
        // since all n elements are unique and there in range [0,n]
        // we store the total sum upto n ( 1 to n ), then ans=total-arraySum
        int i,n=nums.length,sumUptoN,arrSum=0;
        sumUptoN=(n*(n+1))/2;

        for(i=0;i<=n-1;i++){
            arrSum+=nums[i];
        }

        return sumUptoN-arrSum;
    }
}
