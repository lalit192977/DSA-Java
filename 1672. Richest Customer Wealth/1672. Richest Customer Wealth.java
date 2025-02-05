// leetcode Link: https://leetcode.com/problems/richest-customer-wealth/description/

//`====================Solution=======================
class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int maxwealth = wealth;

        for (int i = 0; i < accounts.length; i++) {
            wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > maxwealth) {
                maxwealth = wealth;
            }
        }
        return maxwealth;
    }
}