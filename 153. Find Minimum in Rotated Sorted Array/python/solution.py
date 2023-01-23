class Solution(object):
    def binSearch(self, nums, left, right):
        if nums[left] <= nums[right]:
            return nums[left]
        mid = (left + right) / 2
        if nums[mid] <= nums[right]:
            return self.binSearch(nums, left, mid)
        return self.binSearch(nums, mid + 1, right)
    
    def findMin(self, nums):
        return self.binSearch(nums, 0, len(nums) - 1)