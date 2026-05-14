class Solution {

    public static int maxSum(int i,int arr[],int n,int dp[]){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];

        int ntake=maxSum(i+1,arr,n,dp);
        int take=arr[i]+maxSum(i+2,arr,n,dp);
        return dp[i]=Math.max(ntake,take);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int dp1[]=new int[n];
        int dp2[]= new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        return Math.max(maxSum(0,nums,n-1,dp1),maxSum(1,nums,n,dp2));
        
        
    }
}
