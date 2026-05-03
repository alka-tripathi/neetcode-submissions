class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n)return false;
        int freq1[]= new int[26];
        int freq2[]= new int[26];
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            freq1[ch-'a']++;
        }

         for(int i=0;i<n;i++){
            char ch=s2.charAt(i);
            freq2[ch-'a']++;
        }
        if(Arrays.equals(freq1,freq2))return true;

        int l=0;
        int r=n;
        while(r<m){
            char remove=s2.charAt(l);
            char add = s2.charAt(r);
            freq2[remove-'a']--;
            freq2[add-'a']++;
              if(Arrays.equals(freq1,freq2))return true;
              r++;
              l++;
        }
        return false;
        
    }
}
