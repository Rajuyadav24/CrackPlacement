class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        int start = 0, end = s.length()-1;
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;

    }
    public boolean isPalindrome(String s,int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
