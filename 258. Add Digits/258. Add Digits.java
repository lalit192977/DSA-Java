// Leetcode Link: https://leetcode.com/problems/add-digits/

//.===============Solution===================



class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int ans = 0;
            while (num != 0) {
                int rem = num % 10;
                ans = ans + rem;
                num = num / 10;
            }
            num = ans;
        }
        return num;
    }
}