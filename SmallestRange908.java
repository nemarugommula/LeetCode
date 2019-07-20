public int smallestRangeI(int[] A, int K) {
	int min = 10000;
	int max = 0;
	for (int i = 0; i < A.length; i++) {
		if (A[i] < min) min = A[i];
		if (A[i] > max) max = A[i];
		//min = Math.min(min, A[i]);
		//max = Math.max(max, A[i]);
	}
	int mid = (max + min) / 2;
	int difference = Math.max(max - K, mid) - Math.min(min + K, mid);
	return difference;
}
// mysolution
class Solution {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int diff = ((A[A.length-1]-K)-(A[0]+K))>0?A[A.length-1]-A[0]-2*K:0;
        return diff;
    }
}