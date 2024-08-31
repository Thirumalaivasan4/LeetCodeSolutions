class Solution:
    def twoSum(self, nums, k):
        index = [0, 0]
        
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == k:
                    index[0] = i
                    index[1] = j
                    return index 
        
        return index  
