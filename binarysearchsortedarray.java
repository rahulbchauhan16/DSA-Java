class binarysearchsortedarray {
    public static void main(String[] args) {
        int[] arr = { -7, -3, 0, 2, 3, 4, 12, 13, 14 };
        int target = -3;
        int ans = binarySearch(arr, target);
        System.out.println("Element found at Index : " + ans);
    }

    // return the index
    // return -1 if it doesnt exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; this might cause error if the int range exceeds
            // then java give error

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
