
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null||haystack==null){
            return 0;
        }
        return haystack.indexOf(needle);
    }
}