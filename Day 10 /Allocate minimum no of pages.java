static boolean isPossible(int arr[], int n, int m,
                              int curr_min)
    {
        int studentsRequired = 1;
        int curr_sum = 0;

        // iterate over all books
        for (int i = 0; i < n; i++) {
            curr_sum += arr[i];
            if (curr_sum > curr_min) {
                studentsRequired++; // increment student
                                    // count

                curr_sum = arr[i]; // update curr_sum
            }
        }

        return studentsRequired <= m;
    }

    // method to find minimum pages
    static int findPages(int arr[], int n, int m)
    {
        int sum = 0;

        // return -1 if no. of books is less than
        // no. of students
        if (n < m)
            return -1;
        int mx = arr[0];

        // Count total number of pages
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            mx = (arr[i] > mx ? arr[i] : mx);
        }

        // initialize start as arr[n-1] pages(minimum answer
        // possible) and end as total pages(maximum answer
        // possible)
        int start = arr[n - 1], end = sum;
        int result = Integer.MAX_VALUE;

        // traverse until start <= end
        while (start <= end) {
            // check if it is possible to distribute
            // books by using mid is current minimum
            int mid = start + (end - start) / 2;
            if (isPossible(arr, n, m, mid)) {
                // update result to current distribution
                // as it's the best we have found till now.
                result = mid;

                // as we are finding minimum so,
                end = mid - 1;
            }

            else
                // if not possible, means pages should be
                // increased ,so update start = mid + 1
                start = mid + 1;
        }

        // at-last return minimum no. of  pages
        return result;
    }
