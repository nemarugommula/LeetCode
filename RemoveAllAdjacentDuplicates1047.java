class Solution {
    public String removeDuplicates(String S) {
        if(S==null){
            return null;
        }
        Stack<Character> s = new Stack<>();
        s.push(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(!s.isEmpty()){
            if(s.peek()==S.charAt(i)){
                s.pop();
                continue;
            }
            }
                s.push(S.charAt(i));
            
        }
        String answer="";
        while(!s.isEmpty()){
            answer+=s.pop();
        }
       return reverse(answer);
        
        }
    public String reverse(String s){
        char []c = s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        
        return new String(c);
    }
}