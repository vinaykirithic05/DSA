# Subarray Product Less Than K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of integers `nums` and an integer `k`.

Return the number of contiguous subarrays where the  **product**  of all the elements in the  **subarray**  is  **strictly less**  than `k`.

 

Original
Java
 **Example 1:** 

```
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- 1 <= nums[i] <= 1000
- 0 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 73.05%)  
**Memory:** 48.4 MB (beats 88.13%)  
**Submitted:** 2026-11-24T14:46:16.890Z  

```java
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int left = 0 ;
        int n = nums.length;
        int count = 0 ;
        int prod = 1;
        for(int right = 0; right < n ; right++){
            prod *= nums[right];
            while(prod >= k){
                prod /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-product-less-than-k/)