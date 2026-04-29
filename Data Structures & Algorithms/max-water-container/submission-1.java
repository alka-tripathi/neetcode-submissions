class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0;
        int r=n-1;
        int maxarea=0;
        while(l<r){
            int b=r-l;
            int h=Math.min(heights[l],heights[r]);
            maxarea=Math.max(maxarea,b*h);
            if(heights[l]>heights[r]){
                r--;
            }else if(heights[r]>heights[l]){
                l++;
            }else{
                l++;
                r--;
            }
            
        
        }
        return maxarea;
        
    }
}
