<i>A subarray is a contiguous non-empty sequence of elements within an array.</i>
<h1>713. Subarray Product Less Than K</h1>
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

<h1>2958. Length of Longest Subarray With at Most K Frequency</h1>
<p>An integer array nums and an integer k. The frequency of an element x is the number of times it occurs in an array.
The frequency of each element in this array is less than or equal to k.Return the length of the longest good subarray of nums.
</p>

```
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> ma = new HashMap<>();
        if(nums.length == 1)return 1;
        int i=0, j=0;
        int size = j-i+1;
        int maxi = -1;
        while(j<nums.length){
            if(!ma.containsKey(nums[j])){
                ma.put(nums[j],1);
            }
            else if(ma.get(nums[j])<k){
                ma.put(nums[j],ma.get(nums[j])+1);
            }
            else{
                ma.put(nums[i],ma.get(nums[i])-1);
                i++;
                continue;
            }
            size = j-i+1;
            maxi = Math.max(maxi,size);
            j++;
        }
        return maxi;
    }
}
```
