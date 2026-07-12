class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int x1 = x;
        while (x > 0) {
            int d = x % 10;
            x/=10;
            res = (res * 10) + d;
        }
        if (res == x1) {
            return true;
        } else {
            return false;
        }
    }
}