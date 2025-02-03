// Leetcode link: https://leetcode.com/problems/palindrome-number/description/?source=submission-ac

// .===============Solution===================
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        if (x < 0)
            return false;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        if (rev == x)
            return true;

        return false;
    }
}



// `=====================Another Solution==================
class Solution {
    public boolean isPalindrome(int x) {
        char[] arr = Integer.toString(x).toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}