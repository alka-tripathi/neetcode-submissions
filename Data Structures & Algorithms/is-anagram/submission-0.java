class Solution {
    public static boolean anagram(String s,String s2){
        char arr[]= s.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int l=0;
        int r=0;
        int n=s.length();
        while(l<n){
            if(arr[l]!=arr2[r]) return false;
            l++;
            r++;
        }
        return true;

    }
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)return false;
        
        return anagram(s,t);



    }
}
