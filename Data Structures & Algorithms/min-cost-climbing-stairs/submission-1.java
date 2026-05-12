class Solution {
    public static int solution(int i,int arr[],int dp[]){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1)return dp[i];

       
        return dp[i]=Math.min(arr[i]+solution(i+2,arr,dp),arr[i]+solution(i+1,arr,dp));

      
    }
    public int minCostClimbingStairs(int[] cost) {


   //as it is written here i can choose index 0 or index 1
   int n=cost.length;
   int dp[]= new int[n+1];
   Arrays.fill(dp,-1);
        return Math.min(solution(0,cost,dp),solution(1,cost,dp));
        
    }
}
