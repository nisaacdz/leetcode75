impl Solution {
    pub fn max_product(nums: Vec<i32>) -> i32 {
        let (mut min, mut max, mut ans) = (1, 1, i32::MIN);

        for num in nums {
            let (a, b) = (min * num, max * num);
            min = i32::min(num, i32::min(a, b));
            max = i32::max(num, i32::max(a, b));

            ans = i32::max(ans, max);
        }

        ans
    }
}
