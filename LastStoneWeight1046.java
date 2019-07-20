class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==0){
            return 0;
        }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
        for(int i : stones){
            maxHeap.add(i);
        }
        while(maxHeap.size()!=1){
            int ls = maxHeap.poll();
            int lfs = maxHeap.poll();
            maxHeap.add(ls-lfs);
        }
        return maxHeap.poll();
    }
}