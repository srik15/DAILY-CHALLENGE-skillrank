<h3>713. Subarray Product Less Than K</h3>
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
<br>
<h3>type 1 solution</h3>

```
class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        le=len(nums)
        count=0
        flag=0
        for p in range(le):
            for i in range(le-p):
                val=1
                for j in range(i,i+p+1):
                    val*=nums[j]
                    if val>k:
                        flag=1
                        break
                if flag==1:
                    flag=0
                    break
                if val<k:
                    count+=1
        return count
```


<h3>type 2 solution</h3>

```
class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        le=len(nums)
        i=0
        count =0
        val=1
        for j in range(le):
            val*=nums[j]
            while i<=j and val>=k:
                val/=nums[i]
                i+=1
            count+=(j-i+1)
        return count
            
```
