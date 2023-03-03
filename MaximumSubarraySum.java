public class MaximumSubarraySum {
	// Kadane's Algorithm
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum = 0, curr = 0;
		for(int i = 0;i < n;i++){
			curr += arr[i];
			sum = Math.max(sum, curr);
			if(curr < 0){
				curr = 0;
			}
		}
		return sum;
	}

}

