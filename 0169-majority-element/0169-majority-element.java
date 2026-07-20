class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int tmp = 0;
        for (int i : nums) {
            if (c == 0) {
                tmp = i;
            }
            if (i == tmp) {
                c++;
            } else {
                c--;
            }
        }
        return tmp;
    }
}