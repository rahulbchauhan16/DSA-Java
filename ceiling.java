class ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        int ans = ceilings(arr, target);
        System.out.println("Element found at Index : " + ans + " And Value is : " + arr[ans]);
    }

    // return the index
    // return -1 if it doesnt exist
    static int ceilings(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is in ascending or descending
        boolean isAsc;
        // boolean isAsc = arr[start] < arr[end];
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; this might cause error if the int range exceeds
            // then java give error

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return start;
    }
}
