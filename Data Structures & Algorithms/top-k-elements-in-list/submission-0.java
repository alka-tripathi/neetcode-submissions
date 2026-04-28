class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int a:map.keySet()){
            pq.add(a);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[]= new int[k];
        int h=pq.size();
        for(int i=0;i<h;i++){
            ans[i]=pq.poll();
        }
        return ans;

        
    }
}
