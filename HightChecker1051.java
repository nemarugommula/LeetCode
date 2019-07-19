class Solution {
    public int heightChecker(int[] heights) {
        int answer=0;
        int []tempArray = heights.clone();
            
        Arrays.sort(heights);
        for(int i = 0;i<heights.length;i++){
            if(heights[i]!=tempArray[i]){
                answer++;
            }
        }
        
        
        return answer;
    }
}