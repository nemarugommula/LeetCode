class Solution {
    public String removeOuterParentheses(String S) {
        int conditioner = 0;
        StringBuilder SB = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                if(conditioner>0){
                    SB.append('(');
                }
                conditioner++;
            }
            else{
                if(conditioner>0){
                    SB.append(')');
                    conditioner--;
                }
                
            }
        }
       return SB.toString(); 
    }
}