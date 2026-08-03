class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i,j = 0, len(nums) -1
        while i !=j:
            curSum = nums[i]+nums[j]
            if curSum  == target:
                return [i+1,j+1]
            elif curSum < target:
                i+=1
            else:
                j-=1
