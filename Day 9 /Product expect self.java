class Solution {
    public static long[] productExceptSelf(int arr[]) {
        int n = arr.length;
        long[] prod = new long[n];
        // Base case
        // if the size of the array is 1, return 1 as the product
        if (n == 1) {
            prod[0] = 1;
            return prod;
        }

        long temp = 1;

        /* Initialize the product array as 1 */
        // initialize all elements in the prod array as 1
        for (int i = 0; i < n; i++) prod[i] = 1;

        /* In this loop, temp variable contains product of
        elements on left side excluding arr[i] */
        // calculate the product of all elements on the left side of each element
        for (int i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }
        /* Initialize temp to 1 for product on right side */
        // reset the temp variable to 1 for calculating the product on the right side of
        // each element
        temp = 1;

        /* In this loop, temp variable contains product of
        elements on right side excluding arr[i] */
        // calculate the product of all elements on the right side of each element
        for (int i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }
        // return the final product array
        return prod;
    }
}
