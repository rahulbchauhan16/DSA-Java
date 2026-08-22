class minimumnumber {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 3, -19, 25, 11, 32 };
        int ans = min(arr);
        System.out.println("Minimum Number is : " + ans);
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
}
