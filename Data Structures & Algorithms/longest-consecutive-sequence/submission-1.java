class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int maxlen=Integer.MIN_VALUE;
        for(int a:set){
            if(!set.contains(a-1)){
                int curr=a;
                int len=1;

                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen==Integer.MIN_VALUE?0:maxlen;
        
    }
}
