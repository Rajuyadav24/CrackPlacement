import java.util.*;
public class Solution {
    public static boolean isPossible(int[] arr,int k,int dist){
        int cowsPlaced = 1; // 1st position
        int lastPlaced = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - lastPlaced >= dist){
                cowsPlaced++;
                lastPlaced = arr[i];
            }
        }
        return cowsPlaced >= k;

    }

    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n-1] - stalls[0];
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(isPossible(stalls,k,mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;

    }
}
