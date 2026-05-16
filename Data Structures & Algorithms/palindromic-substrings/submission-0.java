class Solution {
    public static boolean isPalindrom(String str){
        char arr[]= str.toCharArray();
        int i=0;
        int j=str.length()-1;

        while(i<=j){
            if(arr[i]!=arr[j])return false;
            i++;
            j--;
        }
        return true;

        
    }
    public int countSubstrings(String s) {
int n=s.length();
int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str=s.substring(i,j+1);
                if(isPalindrom(str)){
                    count++;
                }

            }
        }
        return count;
        
    }
}
