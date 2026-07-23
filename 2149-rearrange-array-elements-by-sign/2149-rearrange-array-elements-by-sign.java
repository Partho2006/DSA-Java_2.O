class Solution { 
    public int[] rearrangeArray(int[] nums) { 
        int n = nums.length; 
        List<Integer> pos = new ArrayList<>(); 
        List<Integer> neg = new ArrayList<>(); 
        
        for(int i = 0; i < n; i++) { 
            if (nums[i] > 0) { 
                pos.add(nums[i]); 
            } else { 
                neg.add(nums[i]); 
            } 
        } 
        
        int c = 0; 
        int c1 = 0; 
        for (int i = 0; i < n; i++) { 
            if (i % 2 == 0) { 
                nums[i] = pos.get(c1); 
                c1++; 
            } else { 
                nums[i] = neg.get(c); 
                c++; 
            } 
        } 
        return nums; 
    } 
}
