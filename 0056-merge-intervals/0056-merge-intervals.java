class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        List<int[]> result=new ArrayList<>();
        int[] arr=intervals[0];
        result.add(arr);
        for(int[] i : intervals) {
            if(i[0] <= arr[1]) {
                arr[1]=Math.max(arr[1], i[1]);;
            } else {
                arr=i;
                result.add(arr);
            }
        }        
        return result.toArray(new int[result.size()][]);
    }
}