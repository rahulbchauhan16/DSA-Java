public class Hollowsquare {
    public static void main(String[] args) {
        int n = 5;
        int spcs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("*");
            for (int j = 0; j <= spcs; j++) System.out.print(" ");
            for (int j = 1; j <= n - i; j++) System.out.print("*");
            System.out.println();
            spcs += 2;
        }
        spcs = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 0; j <= spcs; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
            spcs -= 2;
        }
    }
}
