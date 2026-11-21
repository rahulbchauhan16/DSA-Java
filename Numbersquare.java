public class Numbersquare {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i, left = j, right = size - 1 - j, bottom = size - 1 - i;
                int m = Math.min(Math.min(top, left), Math.min(right, bottom));
                System.out.print(n - m);
            }
            System.out.println();
        }
    }
}
