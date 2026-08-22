class searchinrange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 3, -19, 25, 11, 32 };
        int target = 25;
        int ans = linearSearch(arr, target, 1, 5);
        System.out.println("Element found in array at Index : " + ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
