class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result=[0]*2
        i,j = 0, len(nums) -1
        while i !=j:
            if nums[i]+nums[j] == target:
                result[0]=i+1
                result[1]=j+1
                break
            elif nums[i]+nums[j] < target:
                i+=1
            else:
                j-=1
        return result
