class Solution {
    public boolean isPalindrome(String s) {
      s=  s.toLowerCase();
        int m=s.length();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch) || Character.isLetter(ch)){
               str.append(ch);
            }
         
        }
        int l=0;
        int n=str.length();
        int r=n-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}
