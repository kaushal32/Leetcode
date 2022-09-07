class Solution {
    public int singleNumber(int[] nums) {
         int res=0;
        for(int i: nums)
        {
            res^=i; // a^0= a and a^a=0
        }
        return res;
    }
}