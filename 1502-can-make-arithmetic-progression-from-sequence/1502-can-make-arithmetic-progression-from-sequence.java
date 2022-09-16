class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[0]-arr[1]!=arr[i]-arr[i+1])return false;
        }
        return true;
    }
}