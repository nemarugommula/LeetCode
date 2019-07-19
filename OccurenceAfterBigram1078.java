class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String []words = text.split(" ");
       StringBuilder SB = new StringBuilder();
        for(int i=0;i<words.length-1;i++){
            if(words[i].equals(first)&&words[i+1].equals(second)&&(i+2)<words.length){
                SB.append(words[i+2]);
                SB.append(" ");
            }
        }
        String []answer = SB.toString().split(" ");
        return answer.length>0?(answer):(null);
    }
}