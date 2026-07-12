class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int r=0, s=0;
        int n=x;
        while (x > 0) {
            r=x%10;
            s=s*10+r;
            x/=10;
        }
        if (s==n) {
            return true;
        } else {
            return false;
        }
    }
}