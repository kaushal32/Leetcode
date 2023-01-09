class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[][]{};
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }

            return Integer.compare(o1[0], o2[0]);
        });

        for (int[] interval : intervals) {
            heap.add(interval);
        }

        int[] toBeMerged = heap.poll();
        List<int[]> mergedIntervals = new ArrayList<>();

        while (!heap.isEmpty()) {
            int[] currInterval = heap.poll();

            if (toBeMerged[1] >= currInterval[0]) {
                toBeMerged[0] = Math.min(toBeMerged[0], currInterval[0]);
                toBeMerged[1] = Math.max(toBeMerged[1], currInterval[1]);
            } else {
                mergedIntervals.add(toBeMerged);
                toBeMerged = currInterval;
            }
        }

        mergedIntervals.add(toBeMerged);

        int[][] result = new int[mergedIntervals.size()][2];

        for (int i = 0; i < result.length; i++) {
            result[i] = mergedIntervals.get(i);
        }

        return result;
    }
}