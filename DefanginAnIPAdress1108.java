class Solution {
    public String defangIPaddr(String address) {
        if(address==null)
            return null;
        StringBuilder SB = new StringBuilder();
        for(char c : address.toCharArray()){
            if(c=='.'){
                SB.append("[.]");
            }
            else{
                SB.append(c);
            }
        }
        return SB.toString();
    }
}