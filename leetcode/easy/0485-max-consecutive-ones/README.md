# Max Consecutive Ones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary array `nums`, return  *the maximum number of consecutive* `1` *'s in the array*.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

```

 **Example 2:** 

```
Input: nums = [1,0,1,1,0,1]
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 98.91%)  
**Memory:** 52.1 MB (beats 60.22%)  
**Submitted:** 2026-11-24T12:24:29.780Z  

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max_count = 0;
        int current_count = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1 ){
                current_count++;
            }
            else{
                max_count = Math.max(max_count,current_count);
                current_count = 0;
            }
        }
        return Math.max(max_count,current_count);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/max-consecutive-ones/)