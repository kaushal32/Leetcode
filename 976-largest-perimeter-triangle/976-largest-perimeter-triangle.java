class Solution {
    public int largestPerimeter(int[] nums) {  int ans=0;   Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int a=nums[i];int b=nums[i+1];int c=nums[i+2];
            if(a+b>c&b+c>a&&c+a>b)ans= a+b+c;
        }return ans;
    }
}