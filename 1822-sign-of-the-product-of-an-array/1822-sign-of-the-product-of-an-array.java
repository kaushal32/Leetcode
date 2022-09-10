class Solution {
public int arraySign(int[] nums) {
int flag=0;
for(int i=0;i<nums.length;i++)
{
if(nums[i]<0)
flag++;
else if(nums[i]==0)
return 0;
}
if(flag%2==1)
return -1;
else
return 1;
}
}