class Solution {
    public static int maxFreq(int arr[]){
        int maxf=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            maxf=Math.max(maxf,arr[i]);
        }
        return maxf;
    }
    public int characterReplacement(String s, int k) {
        int freq[]= new int[26];

        int n=s.length();
        int l=0;
        int r=0;
        int maxf=0;
        int maxlen=0;
        while(r<n){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            maxf=maxFreq(freq);

            while((r-l+1)-maxf > k){
                //shrik kro
                char c=s.charAt(l);
                freq[c-'A']--;
                maxf=maxFreq(freq);
                l++;
            }
            if((r-l+1)-maxf <=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;

        }
        return maxlen;
        
    }
}
