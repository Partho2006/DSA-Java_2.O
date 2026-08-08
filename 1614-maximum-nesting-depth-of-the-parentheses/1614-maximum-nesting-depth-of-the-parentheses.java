class Solution {
    public int maxDepth(String s) {
        int c=0, maxi=0;
        for(char i:s.toCharArray()) {
            if(i=='(') {
                c++;
            } else if (i==')') {
                c--;
            }
            maxi=Math.max(c, maxi);
        }
        return maxi;
    }
}