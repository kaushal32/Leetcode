class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0)
        {
            return 0;
        }
        if(nums.length == 1)
        {
            if(nums[0] == k)
                return 1;
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0,1);
        for(int i =0;i<nums.length;i++)
        {
            sum = sum+nums[i];
            if(map.containsKey(sum-k))
                res = res+map.get(sum-k);
            if(!map.containsKey(sum))
                map.put(sum,1);
            else
                map.put(sum,map.get(sum)+1);
            
        }
        return res;
    }
}