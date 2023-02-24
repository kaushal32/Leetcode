class Solution {
    public int[][] merge(int[][] intervals) {
        
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i = 0;i<intervals.length;i++){
            start[i] = intervals[i][0];
            end[i] =   intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        List<int[]> res = new ArrayList<>();
        int[] prev = {start[0],end[0]};
        res.add(prev);
        for(int i = 0;i<start.length;i++){
            if(start[i] <= prev[1]){
                prev[1] = Math.max(prev[1],end[i]);
            }
            else{
               prev = new int[]{start[i],end[i]};
                res.add(prev);
            }
        }
        int[][] ans = new int[res.size()][2];
        for(int i = 0;i<ans.length;i++){
            int[] x = res.get(i);
            ans[i][0] = x[0];
            ans[i][1] = x[1];
        }
        return ans;
    }

}