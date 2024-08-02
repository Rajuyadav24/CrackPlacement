class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
       for(int i=0;i<=haystack.length()-n;i++){
           String ans=haystack.substring(i,i+n);{
               if(ans.equals(needle)){
                   return i;
               }
           }
       }
       return -1;
    }

}
