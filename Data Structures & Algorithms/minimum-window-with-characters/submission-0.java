class Solution {
    public String minWindow(String s, String t) {

        int n=s.length();
        int m=t.length();

        //storing t chars
        HashMap<Character,Integer> map = new HashMap<>();
        //pre-inserted values with +ve freq
        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int l=0;
        int r=0;
        int minlen=Integer.MAX_VALUE;
        int count=m;
         int start = 0;
         String ans="";
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)>=0){   //we found time of char freq we want
                    count--;
                }
            }
  //shrinking the array from left side
            while(count==0){
                char c=s.charAt(l);
                if(minlen>(r-l+1)){
                    minlen=r-l+1;
                    ans=s.substring(l,r+1);
                }

                if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);

                if(map.get(c)>0){
                    count++;
                }

                }
                l++;

            }
          
            r++;
        }

       // return minlen==Integer.MAX_VALUE?"":s.substring(start,);
       return ans;
        
        
    }
}
