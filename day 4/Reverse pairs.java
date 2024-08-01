class Solution {
    static int count = 0;
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        countPairs(arr,low,mid,high);
        merge(arr, low, mid, high);  // merging sorted halves
    }
    public static void countPairs(int[] arr,int low,int mid,int high){
        int right = mid + 1;
        for(int i = low; i <= mid; i++){
            while(right <= high && arr[i]/2.0 > arr[right]) right++;
            count += (right - (mid + 1));
        }
    }


    public int reversePairs(int[] nums) {
        count = 0;
        int n = nums.length;
        mergeSort(nums,0,n-1);
        return count;
    }
}
