class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        //poor description to understand
        
    int width =0;
        int lines =1;
        for(char c : S.toCharArray()){
            int w = widths[c-'a'];
            width+=w;
            if(width>100){
                lines++;
                width = w;
            }
        }
        return new int[]{lines,width};
    }
}