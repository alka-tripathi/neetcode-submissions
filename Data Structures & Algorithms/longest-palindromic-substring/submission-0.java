class Solution {
    //public static 
    public static boolean isPalindrom(int i,int j,String str){
        char arr[]= str.toCharArray();
        while(i<=j){
            if(arr[i]!=arr[j])return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        int len=0;
        int maxlen=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrom(i,j,s)){
                    len=j-i+1;
                    if(len>maxlen){
maxlen=len;
ans=s.substring(i,j+1);
                    }
                }
            }
        }
return ans;
        
    }
}
