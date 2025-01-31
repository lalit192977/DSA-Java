// Leetcode Link: https://leetcode.com/problems/two-sum/

//.===============Solution===================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;

        // for(int i=0; i<n; i++){
            
        //     for(int j=0; j<n; j++){
        //         if(i==j){
        //             continue;
        //         }
        //         else if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;



        // .=========== Optimal Approach ======================
        int n= nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                return new int []{map.get(diff), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;

    }
}