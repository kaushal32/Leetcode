class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int OS = nums[0];
        int min = nums[0]; int res = nums[0];
        int min2 = nums[0]; int res2 = nums[0];
        for(int i = 1; i<nums.length; i++){
            OS+=nums[i];
            //Reverse Kadane's
            min = Math.min(nums[i]+min,nums[i]);
            res = Math.min(res,min);
            //Kadane's
            min2 = Math.max(nums[i]+min2,nums[i]);
            res2 = Math.max(res2,min2);
        }
        //If All numbers are negative.
        if(OS == res) return res2;
        return Math.max(OS-res,res2);
    }
}