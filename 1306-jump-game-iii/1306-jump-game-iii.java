class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] vis = new boolean[arr.length];
        return solve(arr,start,vis);
    }
    
    private boolean solve(int[] arr,int i,boolean[] vis)
    {
        if(i>=arr.length||i<0||vis[i])
            return false;
        if(arr[i]==0)
            return true;
        vis[i] = true;
        return solve(arr,i+arr[i],vis) || solve(arr,i-arr[i],vis);
    }
}