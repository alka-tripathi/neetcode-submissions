class Solution {
    public static boolean isPalindrom(int i,int j,String s,int dp[][]){

        if(i>=j){
            return true;
        }
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(s.charAt(i)==s.charAt(j)){
            boolean ans=isPalindrom(i+1,j-1,s,dp);
            dp[i][j]= ans?1:0;
            return ans;
        }
        dp[i][j]=0;
        return false;
      

        
    }
    public int countSubstrings(String s) {
int n=s.length();
int count=0;
int dp[][]= new int[n][n];
for(int i=0;i<n;i++){
    Arrays.fill(dp[i],-1);
}
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrom(i,j,s,dp)){
                    count++;
                }

            }
        }
        return count;
        
    }
}
