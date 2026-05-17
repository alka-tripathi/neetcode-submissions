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
boolean dp[][]= new boolean[n][n];
    
      for(int L=1;L<=n;L++){
        for(int i=0;i+L-1<n;i++){
            int j=i+L-1;
            if(i==j){  // 1 len
                dp[i][i]=true;

            }else if(i+1==j){   //2 len
            if(s.charAt(i)==s.charAt(j)) dp[i][j]=true;

            }else{
  if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
    dp[i][j]=true;
  }
            }

            if(dp[i][j])count++;
        }
      }


return count;


        
    }
}
