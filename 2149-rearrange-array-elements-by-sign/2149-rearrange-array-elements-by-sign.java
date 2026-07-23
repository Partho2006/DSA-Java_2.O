class Solution { 
    public int[] rearrangeArray(int[] nums) { 
        int n = nums.length; 
        int[] arr=new int[n];
        int c1=0, c2=1;
        for (int i=0; i<n; i++) {
            if (nums[i] > 0) {
                arr[c1]=nums[i];
                c1+=2;
            } else {
                arr[c2]=nums[i];
                c2+=2;
            }
        }
        return arr;
    } 
}
