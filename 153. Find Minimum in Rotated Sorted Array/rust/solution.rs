impl Solution {
    pub fn find_min(nums: Vec<i32>) -> i32 {
        Self::binSearch(&nums, 0, nums.len() - 1)
    }

    fn binSearch(nums: &Vec<i32>, left: usize, right: usize) -> i32 {
        if nums[left] <= nums[right] { return nums[left] }

        let mid = (left + right) / 2;

        if nums[mid] <= nums[right] { return Self::binSearch(nums, left, mid) }
        return Self::binSearch(nums, mid + 1, right)
    }
}