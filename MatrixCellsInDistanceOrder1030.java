class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
                PriorityQueue<int[]> Heapp = new PriorityQueue<>((a,b)->(Math.abs(a[0] - r0) + Math.abs(a[1] - c0)) - (Math.abs(b[0] - r0) + Math.abs(b[1] - c0)));

        
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                Heapp.add(new int[]{i,j});
            }
        }
       int [][]answer1 = new int[R][C];
        List<int[]> answer = new ArrayList<>();
       while (!Heapp.isEmpty()) {
            answer.add(Heapp.poll());
        }
        answer1 = answer.toArray(answer1);
        return answer1;
        
    }
}