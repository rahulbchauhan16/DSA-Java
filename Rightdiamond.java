public class Rightdiamond {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= 2 * n - 1; i++) {
            int x = i;
            if (i > n) x = 2 * n - i;
            for (int j = 1; j <= x; j++) System.out.print("*");
            System.out.println();
        }
    }
}
