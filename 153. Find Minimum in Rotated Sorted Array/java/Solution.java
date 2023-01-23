class Solution {
    public int findMin(int[] nums) {
        return nums[binSearch(nums, 0, nums.length - 1)];
    }
    
    private int binSearch(int[] nums, int i, int j){
        if(nums[i] <= nums[j]) return i;
        
        int m = (i + j) / 2;
        
        if(nums[m] < nums[j]) return binSearch(nums, i, m);;
        
        return binSearch(nums, m + 1, j);
    }
}