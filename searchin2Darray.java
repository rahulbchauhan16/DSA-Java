import java.util.Arrays;

class searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 14, 16 },
                { 3, 6, 9 },
                { -17, 44, 2 }
        };
        int trg = 9; // index at [1,2]
        int[] ans = search(arr, trg);
        System.out.println("Ans : " + Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int trg) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == trg) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}