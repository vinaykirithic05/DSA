class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int windowSum = 0 ;
        for(int i = 0 ; i < k ; i++){
            windowSum += arr[i];
        }
        int max_ans = windowSum;
        for(int j = k ; j < n; j++){
            windowSum += arr[j];
            windowSum -= arr[j - k];
            
            max_ans = Math.max(max_ans , windowSum);
        }
        return max_ans;
    }
}