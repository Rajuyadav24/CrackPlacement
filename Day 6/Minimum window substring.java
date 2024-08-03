class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }
        int left = 0, right = 0, count = t.length(), minLen = Integer.MAX_VALUE, minStart = 0;
        while (right < s.length()) {
            if (freq[s.charAt(right++)]-- > 0) {
                count--;
            }
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                if (freq[s.charAt(left++)]++ == 0) {
                    count++;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}


