// to remove the val from the nums inplace and return its updated length 
//O(N)->time and space O(1)-->space
public class REmoveElement27{
    public static void main(String []args){
        //calling the function from here 
        //removeElement(nums ,val);
    }
       public static int removeElement(int[] nums, int val) {
            int pointer= -1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[++pointer] =nums[i];
                }
            }
            return pointer+1;
        }
    
}