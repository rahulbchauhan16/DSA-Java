class minmaxsearch {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 3, -19, 25, 11, 32 };
        int ans = min(arr);
        int ans2 = max(arr);
        System.out.println("Minimum Number is : " + ans);
        System.out.println("Maximum Number is : " + ans2);
    }

    // assume arr's length is not 0
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr) {
        int ans2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans2) {
                ans2 = arr[i];
            }
        }
        return ans2;
    }
}
