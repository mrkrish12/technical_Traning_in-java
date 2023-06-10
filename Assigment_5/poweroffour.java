// https://leetcode.com/problems/power-of-four/
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        } else if (n % 4 == 0) {
            return isPowerOfFour(n / 4);
        }
        return false;
    }
}