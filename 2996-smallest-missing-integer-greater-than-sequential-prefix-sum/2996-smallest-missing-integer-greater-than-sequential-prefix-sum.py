class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        sum = 0;i=0
        while i<len(nums)-1 and nums[i+1]-nums[i]==1:
            sum+=nums[i]
            i+=1
        sum+=nums[i]
        if sum not in nums and sum>max(nums):
            return sum
        else:
            while sum in nums:
                sum+=1
            return sum