//bruteforce method 0(N2);
class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        if(heights.length==1){
            return heights[0];
        }
        int max_area=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int min_height = heights[i];
            for(int j=i;j<heights.length;j++){
                min_height = Math.min(min_height,heights[j]);
                max_area = Math.max(max_area,min_height*(j-i+1));
            }
        }
        return max_area;
    }
}