//  Leetcode Link :https://leetcode.com/problems/shuffle-the-array/description/

//`===================Solution=======================
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index] = nums[i];
            ans[index + 1] = nums[n + i];
            index += 2;
        }

        return ans;
    }
}

//`===================Another Solution====================
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }
}