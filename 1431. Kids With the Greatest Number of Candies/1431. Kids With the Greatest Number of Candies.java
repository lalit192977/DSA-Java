// Leetcode Link :https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//`====================Solution=========================

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            // if (candies[i] + extraCandies >= max) {
            //     list.add(true);
            // } else {
            //     list.add(false);
            // }

            // instead of above lines you can use this
            list.add(candies[i] + extraCandies >= max);
        }

        return list;
    }
}
