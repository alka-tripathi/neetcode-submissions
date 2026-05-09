class Solution {
    public int lastStoneWeight(int[] stones) {
        //max priority queue
        PriorityQueue<Integer> pq = new   PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while( pq.size()>=2){

            int fm=pq.poll();
            int sm=pq.poll();
            if(fm> sm || sm> fm){
                int e=Math.abs(fm-sm);
                pq.add(e);
            }
            if(pq.isEmpty())break;
        }
        return pq.isEmpty()?0:pq.peek();
    }
}
