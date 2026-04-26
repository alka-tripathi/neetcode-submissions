class Solution {
    public static String sorting(String str){
        char arr[]=str.toCharArray();
        int n=str.length();
       Arrays.sort(arr);
       

        return new String(arr);
            }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n=strs.length;

        for(int i=0;i<n;i++){
            String s=strs[i];
            String rev=sorting(s);
            if(map.containsKey(rev)){
                List<String> lists= map.get(rev);
                lists.add(s);
                map.put(rev,lists);
            
            }else{
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(rev,list);
            }
            

        }
        List<List<String>> ans = new ArrayList<>();
        for(String a:map.keySet()){
            List<String> list = map.get(a);
            ans.add(list);
        }
        return ans;
        
    }
}
