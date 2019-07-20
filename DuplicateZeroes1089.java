class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                rotateRight(arr,i,arr.length-1);
                arr[i]=0;
                i++;
            }
        }
    }
    public void rotateRight(int[]arr,int i,int j){
        
        while((j-1)>=i){
            arr[j]=arr[j-1];
            j--;
        }
    }
}