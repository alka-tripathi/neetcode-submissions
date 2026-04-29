class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int b=j-i;
                int h=Math.min(heights[i],heights[j]);
                maxarea=Math.max(maxarea,b*h);
            }
        }
        return maxarea;
        
    }
}
