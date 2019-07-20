class Solution {
    public String reverseOnlyLetters(String S) {
        char []arr = S.toCharArray();
        int i=0;
        int j = S.length()-1;
        while(i<j){
           
            if(Character.isLetter(arr[i])&&Character.isLetter(arr[j])){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
            if(!Character.isLetter(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetter(arr[j])){
                j--;
                continue;
            }
        }
        return new String(arr);
    }
}