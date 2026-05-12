class Solution {
    public static int maxiMoney(int i,int arr[],int dp[]){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1)return dp[i];

        int not_take=maxiMoney(i+1,arr,dp);
        int take=arr[i]+maxiMoney(i+2,arr,dp);

        return dp[i]= Math.max(not_take,take);
        
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);

       // return maxiMoney(0,nums,dp);
       dp[0]=nums[0];
       for(int i=1;i<n;i++){
        int not_take=dp[i-1];
        int take=nums[i]+((i-2)<0?0:dp[i-2]);
        dp[i]=Math.max(not_take,take);


       }
       return dp[n-1];

        
    }
}
