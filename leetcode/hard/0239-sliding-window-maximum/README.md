# Sliding Window Maximum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of integers `nums`, there is a sliding window of size `k` which is moving from the very left of the array to the very right. You can only see the `k` numbers in the window. Each time the sliding window moves right by one position.

Return  *the max sliding window*.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

```

 **Example 2:** 

```
Input: nums = [1], k = 1
Output: [1]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- 1 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 30 ms (beats 74.81%)  
**Memory:** 146.3 MB (beats 48.13%)  
**Submitted:** 2026-11-27T12:57:31.230Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/sliding-window-maximum/)