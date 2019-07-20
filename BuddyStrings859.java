class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        if(A.length()<2){
            return false;
        }
        boolean duplicate = false;
        int []freq = new int[26];
        for(char c : A.toCharArray()){
            freq[c-'a']++;
            if(freq[c-'a']>=2){
                duplicate=true;
            }
        }
        int i=0;
        int diff=0;
        for(char c : B.toCharArray()){
            freq[c-'a']--;
            if(freq[c-'a']<0){
                return false;
            }
            if(A.charAt(i)!=B.charAt(i)){
                diff++;
            }
            i++;
        }
        return duplicate?(diff==0||diff==2):diff==2;
    }
}