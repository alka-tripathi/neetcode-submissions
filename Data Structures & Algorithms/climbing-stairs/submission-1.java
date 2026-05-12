class Solution {
    public static int solution(int n){
        if(n==0 || n==1)return 1;

        return solution(n-1)+solution(n-2);
    }
    public int climbStairs(int n) {
       // return solution(n);
       int dp[]=new int[n+1];
       dp[0]=1;
       dp[1]=1;
for(int i=2;i<=n;i++){
    dp[i]=dp[i-1]+dp[i-2];
}
return dp[n];
       
        
    }
}
