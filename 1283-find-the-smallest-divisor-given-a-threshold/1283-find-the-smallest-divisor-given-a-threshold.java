class Solution {
    public int smallestDivisor(int[] arr, int limit) {
        if (arr.length > limit) return -1;
        int low = 1;
        int high = 0;
        for (int num : arr) {
            if (num > high) {
                high = num;
            }
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sumByD(arr, mid) <= limit) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return low;
    }
    private int sumByD(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + div - 1) / div;
        }
        return sum;
    }
}