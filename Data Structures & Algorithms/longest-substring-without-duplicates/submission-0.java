class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
       
        int l=0;
        int r=0;
        int maxlen=0;
        while(r<n){
            char ch=s.charAt(r);
            
        
      
         while(l<r && map.containsKey(ch)){
          char lch=s.charAt(l);
             map.put(lch,map.getOrDefault(lch,0)-1);
             if(map.get(lch)==0)map.remove(lch);
             l++;
           
        }
      
     

        map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxlen=Math.max(maxlen,r-l+1);
       
        r++;
        }
        return maxlen;
        
    }
}
