class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i = 0, j = 1;
        
        while(i < n && j < n){
            int difference = arr[j] - arr[i];
            if(i != j && difference == x){
                return 1;
            }
            else if(difference < x){
                j++;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
