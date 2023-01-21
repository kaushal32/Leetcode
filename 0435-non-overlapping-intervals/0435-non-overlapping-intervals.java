class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        
        if(n == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        int i=0, j=1, nonOverlappingIntervals = 0;
        
        while(j<n) {
            if(intervals[i][1] > intervals[j][0]) {
                if(intervals[i][1] > intervals[j][1]) {
                    i = j;
                }
                nonOverlappingIntervals++;
            } else {
                i = j;
            }
            j++;
        }
        
        return nonOverlappingIntervals;
    }
}