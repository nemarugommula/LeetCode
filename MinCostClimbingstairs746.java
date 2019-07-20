class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==0){
            return 0;
        }
        if(cost.length==1){
            return cost[0];
        }
        int []memo = new int[cost.length];
        Arrays.fill(memo,-1);
        int answer = Math.min(costy(cost,memo,0),costy(cost,memo,1));
        return answer;
    }
    public int costy(int[] cost,int memo[],int i){
        if(i>=cost.length){
            return 0;
        }
        if(memo[i]==-1){
        int value = cost[i]+Math.min(costy(cost,memo,i+1),costy(cost,memo,i+2));
        memo[i]=value;
        }
        return memo[i];
    }
}