class Solution {
    public static class pair{
        int dist;
        int idx;
        public pair(int dist,int idx){
            this.dist=dist;
            this.idx=idx;
        }
    }
    public int[][] kClosest(int[][] points, int k) {

        //for min element we will use min heap
        int n=points.length;

    PriorityQueue<pair> pq = new PriorityQueue<>((a,b)-> a.dist-b.dist);

    for(int i=0;i<n;i++){
        int x=points[i][0];
        int y=points[i][1];
        int sqrts=(x*x)+(y*y);
        
        //int ans=(int)Math.sqrt(sqrts);
        pq.add(new pair(sqrts,i));

    }
    int j=0;
    int result[][]= new int[k][2];
    while(k>0){
        pair p=pq.poll();
        int i=p.idx;
        result[j][0]=points[i][0];
        result[j][1]=points[i][1];
        j++;
        k--;
    }
        
        return result;

    }
}
