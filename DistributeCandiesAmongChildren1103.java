class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int []answer = new int[num_people];
        Arrays.fill(answer,0);
        int pointer =0;
        int sum = 1;
        while(candies>0){
            if(candies<sum)
            answer[pointer]+=candies;
            else
            answer[pointer]+=sum;
                
                pointer=(pointer+1)%(num_people);
            candies = candies-sum;
            sum++;
                }
            
        
        return answer;
    }
}