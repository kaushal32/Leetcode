class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <=1) return 0;
        int ans = 0,i=0,j=0,p=1;
        while(j<nums.length){
            p*=nums[j];
            while(p>=k){
                p/=nums[i++];
            }
            ans+=j-i+1;
            j++;
        }
        return ans;   
    }
}