
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque <Integer> dq = new ArrayDeque<>();
        int[] res = new int[n-k+1];
        int l = 0 ;

        for(int r = 0; r < n ; r++ ){
            while(!dq.isEmpty() && nums[r] > nums[dq.getLast()]){
                dq.pollLast();
            }
            dq.addLast(r);
            if(l > dq.getFirst()){
                dq.pollFirst();
            }
            if((r+1) >= k){
                res[l] = nums[dq.getFirst()];
                l++;
            }
        }
        return res;
       
    }
}
