class Solution {
    public String longestPalindrome(String s) {

        int n=s.length();
        boolean dp[][]= new boolean[n][n];
        int maxlen=Integer.MIN_VALUE;
        int start=-1;

        for(int L=1;L<=n;L++){
            for(int i=0;i+L-1<n;i++){
                int j=L+i-1;
                if(i==j){
                    dp[i][i]=true;
                }else if(i+1==j){
                    if(s.charAt(i)==s.charAt(j)) dp[i][j]=true;
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }


                }

                if(dp[i][j] && maxlen<L){
                    maxlen=L;
                    start=i;
                }
            }
        }
        return s.substring(start,maxlen+start);
    }
}
